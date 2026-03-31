package com.codesspace.EasyBasket.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterProductRequest {

    @NotBlank(message="Product name is required")
    @Size(max=255,message="Product name must be less than 255 characters")
    @NotEmpty
    private String productName;

    @Positive(message="Price must be positive")
    private double price;
}
