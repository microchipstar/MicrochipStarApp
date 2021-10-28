package com.productfrontend.controller;

import com.productfrontend.model.Product;
import com.productfrontend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products", service.getAll());
        return "product";
    }

    @GetMapping("/add")
    public String getAddPage(){
        return "product-add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product, Model model)
    {
        service.addProduct(product);
        return "redirect:/product";
    }


}
