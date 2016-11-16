package org.thinkingingis.service;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;
import org.thinkingingis.baseTest.SpringTestCase;
import org.thinkingingis.domain.User;  
 
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        logger.debug("查找结果" + user);  
        System.out.println(user.getUserName() + " : " + user.getPassword());
    }  
      
  
} 
