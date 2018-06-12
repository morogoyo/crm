package com.morogoyodesings.CRM.repositories;

import org.springframework.data.repository.CrudRepository;

import com.morogoyodesings.CRM.data.Customers;



public interface CustomerRepository extends CrudRepository<Customers, Long> {

}
