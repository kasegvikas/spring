package com.kasegvik.springrest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kasegvik.springrest.model.User;
import com.kasegvik.springrest.service.UserService;

@RequestMapping(value="/users")
@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<User> getUsers(){
		return userservice.getAll();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable Integer id){
		return userservice.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void add(@RequestBody User user){
		userservice.add(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody User user){
		userservice.update(user);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
		userservice.delete(id);
	}
}
