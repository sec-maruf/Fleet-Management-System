package com.marufthegenius.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.marufthegenius.fleetapp.models.User;
import com.marufthegenius.fleetapp.repositories.UserRepository;

@Service
public class UserService {
@Autowired private UserRepository userRepository; 	
@Autowired 	private BCryptPasswordEncoder encoder;

public void save (User user) {
	user.setPassword(encoder.encode(user.getPassword()));
	userRepository.save(user);
	
}
}
