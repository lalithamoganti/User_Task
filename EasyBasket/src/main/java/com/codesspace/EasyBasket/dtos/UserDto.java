package com.codesspace.EasyBasket.dtos;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private Long id;
    private String username;    
    private String emailid;
}
