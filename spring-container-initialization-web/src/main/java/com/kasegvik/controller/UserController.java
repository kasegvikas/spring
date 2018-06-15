package com.kasegvik.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.kasegvik.service.UserService;

@Path("/api/users")
public class UserController {

	private UserService userService;
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Restful example : " + msg;

		userService.method();
		
		return Response.status(200).entity(result).build();

	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
