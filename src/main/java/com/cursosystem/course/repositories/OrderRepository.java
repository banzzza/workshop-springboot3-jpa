package com.cursosystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursosystem.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
