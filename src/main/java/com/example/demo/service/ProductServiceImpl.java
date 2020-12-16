package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public void addProduct(Product prod) {
        productDao.addProduct(prod);
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        productDao.deleteProduct(id);
    }

    @Override
    @Transactional
    public void updateProduct(Product prod) {
        productDao.updateProduct(prod);
    }

    @Override
    @Transactional
    public List<Product> findProduct(String name) {
        return productDao.findProduct(name);
    }
}