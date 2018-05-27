package com.kasegvik.springrest.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kasegvik.springrest.model.User;

@Qualifier("mockuserdao")
@Repository
public class MockDataUserDaoServiceImpl implements UserDaoService {

	private static Map<Integer, User> users = new HashMap<Integer, User>();

	static {
		users.put(1, new User(1, "vikas", "kasegaonkar"));
		users.put(2, new User(2, "nana", "patekar"));
		users.put(3, new User(3, "ramesh", "bhaskar"));
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.dao.UserDaoService#getAll()
	 */
	@Override
	public Collection<User> getAll() {
		return users.values();
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.dao.UserDaoService#getById(java.lang.Integer)
	 */
	@Override
	public User getById(Integer id) {
		return users.get(id);
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.dao.UserDaoService#add(com.kasegvik.springrest.model.User)
	 */
	@Override
	public void add(User user) {
		users.put(user.getId(), user);
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.dao.UserDaoService#update(com.kasegvik.springrest.model.User)
	 */
	@Override
	public void update(User user) {
		User usr = users.get(user.getId());
		if (usr != null) {
			usr.setFirstname(user.getFirstname());
			usr.setLastName(user.getLastName());
			users.put(usr.getId(), usr);
		}
	}

	/* (non-Javadoc)
	 * @see com.kasegvik.springrest.dao.UserDaoService#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer id) {
		users.remove(id);
	}
}
