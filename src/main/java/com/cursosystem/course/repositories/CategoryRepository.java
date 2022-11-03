package com.cursosystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursosystem.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
