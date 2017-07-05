package com.cts.ws.impl;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.aspect.AuthorityService;
import com.cts.aspect.CheckAuthority;
import com.cts.dto.UserDto;
import com.cts.enums.ResponseEnum;
import com.cts.response.CtsResponse;
import com.cts.service.UserService;
import com.cts.ws.UserWebService;

@Service
public class UserWebServiceImpl implements UserWebService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserWebServiceImpl.class);

	@Autowired
	private UserService userService;

	@Autowired
	private AuthorityService authorityService;

	@Override
	public boolean check(String username) {
		LOGGER.info("check username: {}", username);
		UserDto userDto = userService.checkUsername(username);
		return userDto == null;
	}

	@Override
	public CtsResponse login(UserDto userDto) {
		LOGGER.info("user {} login", userDto);
		int i = userService.login(userDto.getUsername(), userDto.getPassword());
		CtsResponse response = new CtsResponse();
		if (i == 1) {
			String key = UUID.randomUUID().toString();
			authorityService.update(key, userDto);
			response.setCode(ResponseEnum.SUCCESS);
			response.setData(key);
		} else {
			response.setCode(ResponseEnum.ERROR);
		}
		return response;
	}

	@Override
	public CtsResponse register(UserDto userDto) {
		LOGGER.info("register user {}", userDto);
		CtsResponse response = new CtsResponse();
		try {
			userService.register(userDto);
			String key = UUID.randomUUID().toString();
			authorityService.update(key, userDto);
			response.setCode(ResponseEnum.SUCCESS);
			response.setData(key);
		} catch (Exception e) {
			LOGGER.error("register exception", e);
			response.setCode(ResponseEnum.ERROR);
		}
		return response;
	}

	@Override
	@CheckAuthority
	public CtsResponse getCurrentUser(String token) {
		CtsResponse response = new CtsResponse();
		if (StringUtils.isBlank(token)) {
			response.setCode(ResponseEnum.ERROR);
			return response;
		}
		UserDto userDto = authorityService.get(token);
		if (userDto == null) {
			response.setCode(ResponseEnum.ERROR);
		} else {
			response.setCode(ResponseEnum.SUCCESS);
			response.setData(userDto);
		}
		return response;
	}

	@Override
	public CtsResponse logout(String token) {
		CtsResponse response = new CtsResponse();
		if (StringUtils.isBlank(token)) {
			response.setCode(ResponseEnum.ERROR);
			return response;
		}
		authorityService.remove(token);
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}
}
