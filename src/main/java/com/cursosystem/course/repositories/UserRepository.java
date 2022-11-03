package com.cursosystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursosystem.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
