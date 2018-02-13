package com.celestine.johnu.reactor.resource.impl;

import com.celestine.johnu.reactor.entity.User;
import com.celestine.johnu.reactor.resource.UserResource;
import com.celestine.johnu.reactor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserResourceImpl implements UserResource {

	@Autowired
	UserService userService;
	
	@Override
	public User getUser(String id) {
		
		return userService.getUser(id);
	}
}
