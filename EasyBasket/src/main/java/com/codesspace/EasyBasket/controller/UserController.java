package com.codesspace.EasyBasket.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.codesspace.EasyBasket.dtos.RegisterUserRequest;
import com.codesspace.EasyBasket.dtos.UserDto;
import com.codesspace.EasyBasket.services.UserService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto register(@Valid @RequestBody RegisterUserRequest request){
        return userService.register(request);
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
}