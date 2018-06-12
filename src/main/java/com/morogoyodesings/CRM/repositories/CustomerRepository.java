package com.morogoyodesings.CRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.morogoyodesings.CRM.data.Customers;



public interface CustomerRepository extends JpaRepository<Customers, Long> {

}
