package com.codesspace.EasyBasket.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Productdto {
    private long id;
    private String productName;
    private double price;
}