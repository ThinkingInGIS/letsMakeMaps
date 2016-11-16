package org.thinkingingis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thinkingingis.dao.UserDao;
import org.thinkingingis.domain.User;

@Service  
public class UserServiceImpl implements UserService {
	
	@Autowired  
	private UserDao userDao;
	
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);  
	}

}
