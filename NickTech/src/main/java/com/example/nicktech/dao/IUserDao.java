package com.example.nicktech.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.nicktech.model.User;
import com.mongodb.client.MongoDatabase;

@Repository
public interface IUserDao extends MongoRepository<User, String>{
	
	 List<User> findAll();

}
