package com.microchipstartapp.product.service;

import com.microchipstartapp.product.model.Product;
import com.microchipstartapp.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    public Product createProduct(Product product) {
        repository.save(product);
        return product;
    }

    public Product getProduct(int id) {
        return repository.findById(id).get();
    }

    public Product updateProduct(int id, Product requestBody) {
        Product record = repository.findById(id).get();
        if (requestBody.getId_P() != null)
            record.setId_P(requestBody.getId_P());

        if (requestBody.getName_P() != null)
            record.setName_P(requestBody.getName_P());

        if (requestBody.getPrice_P() > 0)
            record.setPrice_P(requestBody.getPrice_P());

        if (requestBody.getQuantity_P() > 0)
            record.setQuantity_P(requestBody.getQuantity_P());

        if (requestBody.getImage_P() != null)
            record.setImage_P(requestBody.getImage_P());





        Product r = repository.save(record);

        return r;
    }

    public Product deleteProduct(int id) {
        Product record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
