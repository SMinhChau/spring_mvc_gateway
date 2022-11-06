package com.example.springservice1.controller;

import com.example.springservice1.model.Product;
import com.example.springservice1.service.ProductRestemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/all")
public class ControllerResTemplate {
    @Autowired
    private ProductRestemplateService service;

    @GetMapping("/get-list")
    public ResponseEntity getListOrder() {
        return ResponseEntity.ok(service.getListProduct());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProduct(@PathVariable("id") Long id) {

        return ResponseEntity.ok(service.getProduct(id));
    }

    @GetMapping("/product-line/{id}")
    public ResponseEntity getProductLine(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getProductLine(id));
    }

}
