package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product prod);

    void deleteProduct(Long id);

    void updateProduct(Product prod);

    List<Product> findProduct(String name);
}