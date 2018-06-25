package com.celestine.johnu.reactor.controller;

import com.celestine.johnu.reactor.entity.User;
import com.celestine.johnu.reactor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("user")
	public User getUser(@RequestParam("id") String id) {

		return userService.getUser(id);
	}

	@GetMapping("users/all")
	public List<User> getAllUsers() {

		return userService.getAllUsers();
	}
}
