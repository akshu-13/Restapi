package com.example.homedecor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homedecor.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    
}