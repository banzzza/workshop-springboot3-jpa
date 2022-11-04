package com.cursosystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursosystem.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
