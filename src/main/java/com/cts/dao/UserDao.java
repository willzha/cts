package com.cts.dao;

import org.apache.ibatis.annotations.Param;

import com.cts.dto.UserDto;

public interface UserDao {

	UserDto checkUsername(String username);

	void register(UserDto userDto);

	int login(@Param("username") String username, @Param("password") String password);
}
