package com.kasegvik.springrest.service;

import java.util.Collection;

import com.kasegvik.springrest.model.User;

public interface UserService {

	public abstract Collection<User> getAll();

	public abstract User getById(Integer id);

	public abstract void add(User user);

	public abstract void update(User user);

	public abstract void delete(Integer id);

}