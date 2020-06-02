package com.example.demo.itsol.service;

import com.example.demo.itsol.model.Product;
import com.example.demo.itsol.repository.ProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Transactional
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProducRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findOne(Long id) {
        return productRepository.findById(id);
    }
}
