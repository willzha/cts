package com.cts.interceptor;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

public class UserInterceptor implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		// MultivaluedMap<String, String> header = requestContext.getHeaders();
	}
}
