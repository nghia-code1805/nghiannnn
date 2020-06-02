package com.example.demo.itsol.service;

import com.example.demo.itsol.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product save(Product product);
    void update(Product product);
    void delete(Long id);
    Optional<Product> findOne(Long id);
}
