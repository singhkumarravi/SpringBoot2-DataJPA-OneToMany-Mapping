package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
