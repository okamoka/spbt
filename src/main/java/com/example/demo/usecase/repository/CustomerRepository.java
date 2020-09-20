package com.example.demo.usecase.repository;

import com.example.demo.domain.jpasample.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Iterable<Customer> findByLastName(String string); 
}
