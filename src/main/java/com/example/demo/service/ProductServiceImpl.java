package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(Product prod) {
        productDao.addProduct(prod);
    }

    @Override
    public void deleteProduct(Long id) {
        productDao.deleteProduct(id);
    }

    @Override
    public void updateProduct(Product prod) {
        productDao.updateProduct(prod);
    }

    @Override
    public Product findProduct(String name) {
        return productDao.findProduct(name);
    }
}