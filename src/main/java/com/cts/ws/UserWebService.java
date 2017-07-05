package com.cts.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.cts.response.CtsResponse;
import org.springframework.stereotype.Controller;

import com.cts.dto.UserDto;

@Controller
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/user/v1")
public interface UserWebService {

	@GET
	@Path("/check")
	boolean check(@QueryParam("username") String username);

	@POST
	@Path("/login")
	CtsResponse login(UserDto userDto);

	@POST
	@Path("/register")
	CtsResponse register(UserDto userDto);

	@GET
	@Path("/user")
	CtsResponse getCurrentUser(@CookieParam("Token") String token);

	@GET
	@Path("/logout")
	CtsResponse logout(@CookieParam("Token") String token);

}
