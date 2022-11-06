package com.example.cloud_getway.controller;


import com.example.cloud_getway.model.Product;
import com.example.cloud_getway.service.ProductService;
import lombok.Generated;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/list")
    public ResponseEntity getList() {
        return ResponseEntity.ok(service.getList());
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody Product product) {
        return ResponseEntity.ok(service.create(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity getProduct(@PathVariable Long id) {
        return ResponseEntity.ok(service.finById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable Long id,@RequestBody  Product product) {
        return ResponseEntity.ok(service.update(id, product));
    }
}
