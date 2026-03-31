package com.codesspace.EasyBasket.services;

import org.springframework.stereotype.Service;
import java.util.List;

import com.codesspace.EasyBasket.repository.UserRepository;
import com.codesspace.EasyBasket.model.User;
import com.codesspace.EasyBasket.dtos.UserDto;
import com.codesspace.EasyBasket.dtos.RegisterUserRequest;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public UserDto register(RegisterUserRequest request) {

        if (repo.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User savedUser = repo.save(user);

        return new UserDto(savedUser.getId(), savedUser.getName(), savedUser.getEmail());
    }

    public List<UserDto> getAllUsers() {
        return repo.findAll()
                .stream()
                .map(user -> new UserDto(user.getId(), user.getName(), user.getEmail()))
                .toList();
    }
}