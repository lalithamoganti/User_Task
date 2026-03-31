package com.codesspace.EasyBasket.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.List;
import java.util.stream.Collectors;

import com.codesspace.EasyBasket.model.Product;
import com.codesspace.EasyBasket.dtos.Productdto;
import com.codesspace.EasyBasket.services.ProductService;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.MethodArgumentNotValidException;
import com.codesspace.EasyBasket.dtos.RegisterProductRequest;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
      
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Productdto> getAll(){
        return productService.findAll()
            .stream()
            .map(product -> new Productdto(product.getId(), product.getName(), product.getPrice()))
            .collect(Collectors.toList());
    }

    // @PostMapping
    // @ResponseStatus(HttpStatus.CREATED)
    // public Product create(@RequestBody Product product) {
    //     return productService.save(product);
    // }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody RegisterProductRequest request) {
        Product product = new Product();
        product.setName(request.getProductName());
        product.setPrice(request.getPrice());
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product product) {
        return ResponseEntity.ok(productService.update(id, product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<Map<String,String>> handleValidationError(MethodArgumentNotValidException e) {
    var errors = new HashMap<String,String>();

    e.getBindingResult().getFieldErrors().forEach(error -> {
        errors.put(error.getField(), error.getDefaultMessage());
    });

    return ResponseEntity.badRequest().body(errors);
}

}
