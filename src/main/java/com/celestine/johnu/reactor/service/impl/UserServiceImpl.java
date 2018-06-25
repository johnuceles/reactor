package com.celestine.johnu.reactor.service.impl;

import com.celestine.johnu.reactor.entity.User;
import com.celestine.johnu.reactor.repository.UserRepository;
import com.celestine.johnu.reactor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(String id) {
		
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

	@Override
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

}
