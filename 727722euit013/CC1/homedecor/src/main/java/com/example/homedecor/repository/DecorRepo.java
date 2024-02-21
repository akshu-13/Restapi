package com.example.homedecor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homedecor.model.Decor;

@Repository
public interface DecorRepo extends JpaRepository <Decor,Long>
{

}