package com.codesspace.EasyBasket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codesspace.EasyBasket.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
