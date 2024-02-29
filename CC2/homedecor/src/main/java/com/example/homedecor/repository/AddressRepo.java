package com.example.homedecor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homedecor.model.Address;


@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {

}