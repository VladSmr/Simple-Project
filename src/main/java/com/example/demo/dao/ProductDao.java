package com.example.demo.dao;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductDao {

    void addProduct(Product prod);

    void deleteProduct(Long id);

    void updateProduct(Product prod);

    List<Product> findProduct(String name);
}
