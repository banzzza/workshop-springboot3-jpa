package com.cursosystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursosystem.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
