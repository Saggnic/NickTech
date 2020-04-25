package com.example.nicktech.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.nicktech.model.Company;

@Repository
public interface ICompanyDao extends MongoRepository<Company, String>{
	
	List<Company> findAll();
	
	Company findCompanyByCompanyName();
	
	

}
