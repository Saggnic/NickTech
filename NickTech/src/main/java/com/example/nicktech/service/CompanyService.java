package com.example.nicktech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nicktech.dao.ICompanyDao;
import com.example.nicktech.model.Company;

@Service
public class CompanyService {

	@Autowired
	private ICompanyDao companyDao;
	
	
	public List<Company> fetchAllCompany(){	
		return companyDao.findAll();
		
	}
	
	public String createCompany(Company company) {
		
		companyDao.save(company);
		return "SUCCESS";
	}
	
	
}
