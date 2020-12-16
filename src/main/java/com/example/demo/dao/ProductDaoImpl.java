package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    private final EntityManager em;

    @Autowired
    public ProductDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addProduct(Product prod) {
        if (prod != null) {
            em.persist(prod);
        } else {
            throw new RuntimeException("Product is empty. Try again");
        }
    }

    @Override
    public void deleteProduct(Long id) {
        try {
            em.remove(em.find(Product.class, id));
        } catch (NoResultException e) {
            throw new RuntimeException("Product not found. Check input data and try again");
        }
    }

    @Override
    public void updateProduct(Product prod) {
        if (prod != null) {
            em.merge(prod);
        } else {
            throw new RuntimeException("Product is empty. Try again");
        }
    }

    @Override
    public List<Product> findProduct(String name) {
        Query query = em.createNativeQuery("select * from Product where name = ?");
        query.setParameter(1, name);
        List<Product> product = (List<Product>) query.getResultList();
        if (product.isEmpty()) {
            throw new RuntimeException("Product with provided name not found. Try again");
        } else {
            return product;
        }
    }
}