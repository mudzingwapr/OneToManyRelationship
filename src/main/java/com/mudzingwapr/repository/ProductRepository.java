package com.mudzingwapr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mudzingwapr.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
