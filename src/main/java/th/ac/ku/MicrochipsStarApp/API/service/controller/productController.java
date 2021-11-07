package th.ac.ku.MicrochipsStarApp.API.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MicrochipsStarApp.API.service.model.Message;
import th.ac.ku.MicrochipsStarApp.API.service.model.Product;
import th.ac.ku.MicrochipsStarApp.API.service.model.employee;
import th.ac.ku.MicrochipsStarApp.API.service.repository.MessageRepository;
import th.ac.ku.MicrochipsStarApp.API.service.service.MessageService;
import th.ac.ku.MicrochipsStarApp.API.service.service.ProductService;
import th.ac.ku.MicrochipsStarApp.API.service.service.employeeService;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/Product")
public class productController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    @GetMapping("/{id}")
    public Product getCart(@PathVariable int id) {
        return service.getUser(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public Product delete(@PathVariable int id) {
        return service.delete(id);
    }


}