package com.amdocs.springbootapp1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.springbootapp1.model.CustomerEntity;

@Repository
public interface CustomerRepo extends JpaRepository <CustomerEntity, Integer>{

}
