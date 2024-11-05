package com.example.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product.Model.Entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

}
