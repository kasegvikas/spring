package com.kasegvik.springrest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kasegvik.springrest.dao.UserDaoService;
import com.kasegvik.springrest.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Qualifier("mockuserdao")
	@Autowired
	private UserDaoService userDao;

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.service.UserService#getAll()
	 */
	@Override
	public Collection<User> getAll() {
		return userDao.getAll();
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.service.UserService#getById(java.lang.Integer)
	 */
	@Override
	public User getById(Integer id) {
		return userDao.getById(id);
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.service.UserService#add(com.kasegvik.springrest.model.User)
	 */
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.service.UserService#update(com.kasegvik.springrest.model.User)
	 */
	@Override
	public void update(User user) {
		userDao.update(user);
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.service.UserService#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}
}
