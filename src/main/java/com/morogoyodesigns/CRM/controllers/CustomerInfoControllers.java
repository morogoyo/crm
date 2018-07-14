package com.morogoyodesigns.CRM.controllers;

import java.util.List;
import java.util.Optional;


import com.morogoyodesigns.CRM.data.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.morogoyodesigns.CRM.repositories.CustomerRepository;

@RestController
@RequestMapping(value="/customer")
public class CustomerInfoControllers {	
	
	@Autowired
	private CustomerRepository customerRepo;


//	@GetMapping(value = "/home")
//	public String homePage(){
//
//		return "<h1>Welcome to your CRM</h1>";
//	}

//	@RequestMapping(value = "/")
//	public List<Customers> getAllCustomers(){
//		return  customerRepo.findAll();
//
//	}
	
//	@RequestMapping(value = "/{id}")
//	public Optional<Customers> getOneCustomer(@PathVariable int id) {
//		return customerRepo.findById(id);
//	}


	
	@RequestMapping(method = RequestMethod.POST, value="/insert" )
	public void insertCustomer(@RequestBody Customers customer) {
		System.out.println(customer.getfName());
		customerRepo.save(customer);
		
	}

	@RequestMapping(method = RequestMethod.PUT , value = "/update{id}")
    public void updateCustomersInfo(@PathVariable("id") int id , @RequestBody Customers updateCustomer){

		Customers customerToUpdate = customerRepo.getOne(id);
		System.out.println(customerToUpdate.getfName());
		customerToUpdate.setlName(updateCustomer.getlName());
		customerToUpdate.setfName(updateCustomer.getfName());
		customerRepo.save(updateCustomer);


    }

    @RequestMapping(value = "/delete{id}" , method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable("id") int id){

		Customers deletedClient = customerRepo.getOne(id);
		System.out.println(deletedClient);
		customerRepo.deleteById(id);

	}

}
