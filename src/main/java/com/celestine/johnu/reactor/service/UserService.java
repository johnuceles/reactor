package com.celestine.johnu.reactor.service;

import com.celestine.johnu.reactor.entity.User;

import java.util.List;

public interface UserService {

	User getUser(String id);

    List<User> getAllUsers();
}
