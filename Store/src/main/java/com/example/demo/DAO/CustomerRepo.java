package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
