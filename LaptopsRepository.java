package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Laptops;


@Repository
public interface LaptopsRepository extends JpaRepository<Laptops, Integer> {

}
