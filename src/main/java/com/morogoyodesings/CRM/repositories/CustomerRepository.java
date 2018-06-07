package com.morogoyodesings.CRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morogoyodesings.CRM.data.CustomerInfo;

public interface CustomerRepository extends JpaRepository<CustomerInfo, Long> {

}
