package com.example.cloud_getway.service;

import com.example.cloud_getway.model.Product;
import com.example.cloud_getway.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService  {
    @Autowired
    private ProductRepository repository;

    public  Product create(Product product){
        return  repository.save(product);
    }

    public List<Product> getList(){
        return  repository.findAll();
    }

    public Optional finById(Long id){
        return  repository.findById(id);
    }

    public  Product update(Long id, Product product){
        return  repository.save(product);
    }


}

