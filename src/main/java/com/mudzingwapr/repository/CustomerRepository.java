package com.mudzingwapr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mudzingwapr.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
