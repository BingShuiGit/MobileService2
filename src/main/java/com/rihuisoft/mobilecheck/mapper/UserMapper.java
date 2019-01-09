package com.rihuisoft.mobilecheck.mapper;

import com.rihuisoft.mobilecheck.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository(value = "userMapper")
public interface UserMapper {

	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();
}
