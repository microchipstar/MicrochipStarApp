package com.microchipstartapp.product.productController;

import com.microchipstartapp.product.model.Product;
import com.microchipstartapp.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProduct();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getCart(@PathVariable int id) {
        return service.getProduct(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @RequestBody Product cart) {
        return service.updateProduct(id, cart);
    }

    @DeleteMapping("/{id}")
    public Product delete(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
