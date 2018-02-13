package com.celestine.johnu.reactor.controller;

import com.celestine.johnu.reactor.entity.User;
import com.celestine.johnu.reactor.resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserResource userResource;

	@GetMapping("user")
	public User getUser(@RequestParam("id") String id) {

		return userResource.getUser(id);
	}
}
