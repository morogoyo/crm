package com.morogoyodesings.CRM.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morogoyodesings.CRM.data.CustomerInfo;
import com.morogoyodesings.CRM.repositories.CustomerRepository;

@RestController
@RequestMapping(value="/")
public class CustomerInfoControllers {	
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@GetMapping("/")
	public String homePage(){
		return "<h1>Welcome to your CRM</h1>";
	}
	@GetMapping("info")
	public List<CustomerInfo> getAllCustomers(){
		return customerRepo.findAll();
		
	}

}
