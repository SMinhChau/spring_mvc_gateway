package com.example.springmvc.controller;

import com.example.springmvc.model.ProductLine;
import com.example.springmvc.service.ProductLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pro-line")
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
    public ResponseEntity updateProduct(@PathVariable Long id,@RequestBody  ProductLine product) {
        return ResponseEntity.ok(service.update(id, product));
    }
}
