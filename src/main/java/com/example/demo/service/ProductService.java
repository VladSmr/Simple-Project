package com.example.demo.service;

import com.example.demo.model.Product;

public interface ProductService {

    void addProduct(Product prod);

    void deleteProduct(Long id);

    void updateProduct(Product prod);

    Product findProduct(String name);
}