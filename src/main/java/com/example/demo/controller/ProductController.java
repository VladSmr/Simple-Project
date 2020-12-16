package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/product", produces = APPLICATION_JSON_VALUE)
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PostMapping(value = "/delete/{id}")
    public void deleteProduct(@PathVariable(name = "id") Long id) {
        productService.deleteProduct(id);
    }

    @PostMapping(value = "/update")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @PostMapping(value = "/find/{name}")
    public List<Product> findProduct(@PathVariable(name = "name") String name) {
        return productService.findProduct(name);
    }
}