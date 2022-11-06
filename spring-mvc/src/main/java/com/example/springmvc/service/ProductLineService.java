package com.example.springmvc.service;



import com.example.springmvc.model.ProductLine;
import com.example.springmvc.repository.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductLineService {
    @Autowired
    private ProductLineRepository repository;

    public ProductLine create(ProductLine productLine){
        return  repository.save(productLine);
    }

    public List<ProductLine> getList(){
        return  repository.findAll();
    }

    public Optional finById(Long id){
        return  repository.findById(id);
    }

    public  ProductLine update(Long id, ProductLine productLine){
        return  repository.save(productLine);
    }

}
