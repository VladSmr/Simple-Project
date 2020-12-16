package com.example.demo.dao;

import com.example.demo.model.Product;

public interface ProductDao {

    void addProduct(Product prod);

    void deleteProduct(Long id);

    void updateProduct(Product prod);

    Product findProduct(String name);
}
