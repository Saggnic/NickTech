package com.example.nicktech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nicktech.dao.IUserDao;
import com.example.nicktech.model.User;

@Service
public class UserService {
	
	@Autowired
	private IUserDao userDao; 

	public String createUser(User user) {
		
		userDao.save(user);
		System.out.println("*************************CREATED************************");
		return "created";
	}
	
	
	public List<User> fetchAllUsers(){
		return userDao.findAll();
	}
	
}
