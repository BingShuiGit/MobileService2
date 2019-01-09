package com.rihuisoft.mobilecheck.service.impl;

import com.rihuisoft.mobilecheck.entity.User;
import com.rihuisoft.mobilecheck.mapper.UserMapper;
import com.rihuisoft.mobilecheck.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "userService")
@Transactional //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {

	@Resource(name = "userMapper")
	private UserMapper userMapper;

	List<User> userInfos = null;


	public boolean delete(int id) {
		
		return userMapper.delete(id);
	}

	public List<User> findAll() {
		List<User> findAllList = userMapper.findAll();
		return findAllList;
	}

	public User findById(int id) {

		User user = userMapper.findById(id);
		
		return user;
	}

	public void save(User user) {

		userMapper.save(user);
	}

	public boolean update(User user) {

		return userMapper.update(user);
	}
}
