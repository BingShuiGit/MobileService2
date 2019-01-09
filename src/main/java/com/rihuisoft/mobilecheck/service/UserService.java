package com.rihuisoft.mobilecheck.service;


import com.rihuisoft.mobilecheck.entity.User;

import java.util.List;


public interface UserService {
	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();
}
