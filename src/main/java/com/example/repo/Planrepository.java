package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Plan;

public interface Planrepository extends JpaRepository<Plan, Integer> {

}
