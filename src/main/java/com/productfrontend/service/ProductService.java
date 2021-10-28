package com.productfrontend.service;

import com.productfrontend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Product> getAll() {
        String url = "http://localhost:8091/Product";
        ResponseEntity<Product[]> response =
                restTemplate.getForEntity(url, Product[].class);
        Product[] products = response.getBody();
        return Arrays.asList(products);
    }

    public void addProduct(Product product) {
        String url = "http://localhost:8091/Product";

        restTemplate.postForObject(url, product, Product.class);
    }

}
