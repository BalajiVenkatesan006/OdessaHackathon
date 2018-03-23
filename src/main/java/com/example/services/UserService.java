package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public void addUser(User user) {
    	userRepository.save(user);
	}
    
    public Iterable<User> getUsers(){
    	return userRepository.findAll();
	}
}