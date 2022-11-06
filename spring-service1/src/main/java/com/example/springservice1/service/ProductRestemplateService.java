package com.example.springservice1.service;

import com.example.springservice1.model.Product;
import com.example.springservice1.model.ProductLine;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductRestemplateService {
    private final RestTemplate restTemplate = new RestTemplate();

    private final String url = "http://localhost:8080/api/product/";
    private final String urlId = "http://localhost:8080/api/product/{id}";
    private final String urlIdProductLine = "http://localhost:8080/api/product-line/{id}";


    public List<Product> getListProduct(){
        ResponseEntity<Product[]> response =  restTemplate.getForEntity(url+"list",Product[].class);
        return Arrays.asList(response.getBody());
    }

    public Product getProduct( Long id){
        Map< String, String > params = new HashMap<>();
        params.put("id", String.valueOf(id));
        ResponseEntity<Product> response = restTemplate.getForEntity(urlId, Product.class, params);

        return  response.getBody();
    }

    public ProductLine getProductLine( Long id){
        Map< String, String > params = new HashMap<>();
        params.put("id", String.valueOf(id));
        ResponseEntity<ProductLine> response = restTemplate.getForEntity(urlIdProductLine, ProductLine.class, params);

        return  response.getBody();
    }







}
