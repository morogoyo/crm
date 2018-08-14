package com.morogoyodesigns.CRM.company.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.morogoyodesigns.CRM.company.data.Company;
import com.morogoyodesigns.CRM.company.repository.CompanyRepository;



@RestController
@RequestMapping(value="/company")
public class CompanyInfoControllers {
	
	@Autowired
	private CompanyRepository cr;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Company> getAllCompanies() {
		List<Company> allCompanies = cr.findAll();
		return allCompanies;
	}
	

}
