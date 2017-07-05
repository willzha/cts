package com.cts.service;

import com.cts.dto.UserDto;

public interface UserService {

	UserDto checkUsername(String username);

	void register(UserDto userDto);

	int login(String username, String password);

}
