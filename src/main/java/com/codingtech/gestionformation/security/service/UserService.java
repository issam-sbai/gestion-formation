package com.codingtech.gestionformation.security.service;


import com.codingtech.gestionformation.security.dao2.IUserDao;
import com.codingtech.gestionformation.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class UserService implements IuserService {
	
	@Autowired
	IUserDao userDao;
	
	public User chercherparUsername(String username)
	{
		return userDao.findByUsername(username);
	}

}
