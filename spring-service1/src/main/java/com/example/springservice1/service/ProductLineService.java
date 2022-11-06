package com.example.springservice1.service;

import com.example.springservice1.model.ProductLine;
import com.example.springservice1.repository.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductLineService {
    @Autowired
    private ProductLineRepository repository;

    public ProductLine create(ProductLine product){
        return  repository.save(product);
    }

    public List<ProductLine> getList(){
        return  repository.findAll();
    }

    public Optional finById(Long id){
        return  repository.findById(id);
    }

    public  ProductLine update(Long id, ProductLine product){
        return  repository.save(product);
    }

}
