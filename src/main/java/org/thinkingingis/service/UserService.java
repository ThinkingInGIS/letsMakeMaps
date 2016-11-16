package org.thinkingingis.service;

import org.thinkingingis.domain.User;

public interface UserService {
	
	User selectUserById(Integer userId);
	
}
