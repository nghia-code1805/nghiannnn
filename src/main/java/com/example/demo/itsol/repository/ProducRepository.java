package com.example.demo.itsol.repository;

import com.example.demo.itsol.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducRepository extends JpaRepository<Product, Long> {
}
