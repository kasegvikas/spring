package com.kasegvik.springrest.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kasegvik.springrest.model.User;

@Qualifier("mongoUserDao")
@Repository
public class MongoUserDaoServiceImpl implements UserDaoService {

	private static Map<Integer, User> users = new HashMap<Integer, User>();

	static {
		users.put(1, new User(1, "mongorecord1", "lnamedb"));
	}

	@Override
	public Collection<User> getAll() {
		return users.values();
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
