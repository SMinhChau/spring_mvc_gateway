package com.example.springservice1.controller;

import com.example.springservice1.model.Product;
import com.example.springservice1.model.ProductLine;
import com.example.springservice1.repository.ProductRepository;
import com.example.springservice1.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/product-line")
public class ProductLineController {
    @Autowired
    private ProductLineService service;


    @GetMapping("/list")
    public ResponseEntity getList() {
        return ResponseEntity.ok(service.getList());
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody ProductLine product) {
        return ResponseEntity.ok(service.create(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity getProduct(@PathVariable Long id) {
        return ResponseEntity.ok(service.finById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateProduct(@PathVariable Long id,@RequestBody ProductLine product) {
        return ResponseEntity.ok(service.update(id, product));
    }


}
