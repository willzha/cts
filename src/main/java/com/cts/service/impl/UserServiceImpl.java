package com.cts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.UserDao;
import com.cts.dto.UserDto;
import com.cts.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDto checkUsername(String username) {
		return userDao.checkUsername(username);
	}

	@Override
	public void register(UserDto userDto) {
		userDao.register(userDto);
	}

	@Override
	public int login(String username, String password) {
		return userDao.login(username, password);
	}
}
