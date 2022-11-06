package com.example.springservice1.controller;

import com.example.springservice1.model.Product;
import com.example.springservice1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    public ResponseEntity getProduct(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.finById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable Long id,@RequestBody  Product product) {
        return ResponseEntity.ok(service.update(id, product));
    }

}
