package com.example.nicktech.controller;

import java.util.List;

import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nicktech.model.Company;
import com.example.nicktech.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/createCompany")
	public String createCompany(@Valid Company company1) {
		
		Company company= new Company();
		company.setCompanydetails("details are to be given");
		company.setCompanyName("122 Company");
		company.setLocation("Hyd");
		company.setSalary(20000);
		
		return companyService.createCompany(company);
	
	}
	
	@RequestMapping("/getAllCompanies")
	public List<Company> getAllCompanies(){
		
		return companyService.fetchAllCompany();
	}

	
	
}
