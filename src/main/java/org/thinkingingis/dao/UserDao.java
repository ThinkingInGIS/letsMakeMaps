package org.thinkingingis.dao;

import org.thinkingingis.domain.User;

public interface UserDao {

	public User selectUserById(Integer userId);
}
