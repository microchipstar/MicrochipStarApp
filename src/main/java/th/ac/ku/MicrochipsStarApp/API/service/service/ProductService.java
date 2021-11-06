package th.ac.ku.MicrochipsStarApp.API.service.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import th.ac.ku.MicrochipsStarApp.API.service.model.Message;
import th.ac.ku.MicrochipsStarApp.API.service.model.Product;
import th.ac.ku.MicrochipsStarApp.API.service.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAll()
    {
        return repository.findAll();
    }

    public Product create(Product product)
    {
        repository.save(product);
        return product;
    }

    public Product getUser(int id)
    {
        return repository.findById(id).get();
    }

    public Product update(int id, Product requestBody)
    {
        Product record = repository.findById(id).get();
        record.setName_P(requestBody.getName_P());
        record.setId_P(requestBody.getId_P());
        record.setImage_P(requestBody.getImage_P());
        record.setPrice_P(requestBody.getPrice_P());
        record.setQuantity_P(requestBody.getQuantity_P());


        repository.save(record);

        return record; // Return is optional
    }

    public Product delete(int id)
    {
        Product record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
