package com.example.productmicroservice.controller;

import com.example.productmicroservice.model.Product;
import com.example.productmicroservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "API/GestionProduct")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/")
    public Product AddProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductByID(@PathVariable ("id") String id) {
        return productService.getProductById(id);
    }

    @GetMapping("/")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}
