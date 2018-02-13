package com.celestine.johnu.reactor.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celestine.johnu.reactor.entity.User;
import com.celestine.johnu.reactor.repository.UserRepository;
import com.celestine.johnu.reactor.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(String id) {
		
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

}
