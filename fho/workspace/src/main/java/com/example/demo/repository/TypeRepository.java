package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {

}
