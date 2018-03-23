package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/signup")
	public String signUpUser(@RequestParam String fullName, 
			@RequestParam String password, 
			@RequestParam String confirmPassword, 
			@RequestParam String mobileNumber, 
			@RequestParam String email, 
			@RequestParam String address) throws Exception {
		User user = new User(fullName, password, confirmPassword, email, mobileNumber, address);
		userService.addUser(user);
		return "redirect:/";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) throws Exception {
		for(User user : userRepository.findAll()) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return "redirect:/";
			}
		}
        return "/login";
	}
	
}