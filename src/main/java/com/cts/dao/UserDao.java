package com.cts.dao;

import com.cts.dto.UserDto;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

	UserDto checkUsername(String username);

	void register(UserDto userDto);

	int login(@Param("username") String username, @Param("password") String password);
}
