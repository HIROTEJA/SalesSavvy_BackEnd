package com.example.demo.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	public User userRegister(User user) {
		if (userRepository.findByUsername(user.getUsername()).isPresent()) {
			//throw exception...
			throw new RuntimeException("Username is already taken");
		}
		if(userRepository.findByEmail(user.getEmail()).isPresent()) {
			//throw Exception...
			throw new RuntimeException("Email is already Registered");
		}
		//user setPassword(passwordEncoder.encode(user.getPassword());
		String ppwd = user.getPassword();
		String epwd = passwordEncoder.encode(ppwd);
		user.setPassword(epwd);
		//Write code to encode password
		return userRepository.save(user);	
	}
}