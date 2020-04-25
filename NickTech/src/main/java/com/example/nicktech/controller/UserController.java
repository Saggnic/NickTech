package com.example.nicktech.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.nicktech.model.User;
import com.example.nicktech.service.UserService;

@Controller
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/create")
	public String createUserController() {
		
		User user= new User();
		user.setExp(2);
		user.setLocation("Hyd");
		user.setName("Nick");
		user.setSalary(10000);
		List<String> techs= new ArrayList<String>();
		techs.add("Java");
		techs.add("Spring");
		user.setTechs(techs);
		
		return userService.createUser(user);
		
	}
	
	@RequestMapping("/getDetails")
	@ResponseBody
	public ResponseEntity<List<User>> fetchAllUserDetails(){
		
		List<User> usersList=userService.fetchAllUsers();
		usersList.forEach(new Consumer<User>() {

			@Override
			public void accept(User u) {
				System.out.println("*******"+u.getName()+"****************");	
			}	
		});
		
		return new ResponseEntity<List<User>>(usersList, HttpStatus.OK);
	}
	
}
