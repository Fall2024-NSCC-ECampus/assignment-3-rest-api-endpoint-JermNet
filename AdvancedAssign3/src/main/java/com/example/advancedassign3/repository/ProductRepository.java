package com.example.advancedassign3.repository;

import com.example.advancedassign3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
