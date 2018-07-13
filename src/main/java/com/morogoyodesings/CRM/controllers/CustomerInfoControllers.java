package com.morogoyodesings.CRM.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.morogoyodesings.CRM.data.Customers;
import com.morogoyodesings.CRM.repositories.CustomerRepository;

@RestController
@RequestMapping(value="/")
public class CustomerInfoControllers {	
	
	@Autowired
	private CustomerRepository customerRepo;




	@GetMapping("/home")
	public String homePage(){
		return "<h1>Welcome to your CRM</h1>";
	}

	@GetMapping
	public List<Customers> getAllCustomers(){
		return  customerRepo.findAll();
		
	}
	
	@GetMapping("/customer/{id}") 
	public Optional<Customers> getOneCustomer(@PathVariable int id) {
		return customerRepo.findById(id);
	}


	
	@RequestMapping(method = RequestMethod.POST, value="/insert" )
	public void insertCustomer(@RequestBody Customers customer) {
		System.out.println(customer.getfName());
		customerRepo.save(customer);
		
	}

	@RequestMapping(method = RequestMethod.PUT , value = "/update/{id}")
    public void updateCustomersInfo(@PathVariable("id") Integer id , @RequestBody Customers updateCustomer){

		customerRepo.save(updateCustomer);


    }

}
