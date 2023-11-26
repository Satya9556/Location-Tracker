package com.tracker.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.tracker.dao.UserDao;
import com.tracker.tracker.entity.Users;

@Service
public class UserServiceimpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	public UserServiceimpl() {
		
	}

	@Override
	public Users getUser(String userEmail, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(userEmail, userPassword);
	}

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public void deleteUser(String userEmail) {
		// TODO Auto-generated method stub
		userDao.delete(userDao.getByUserEmail(userEmail));
		
	}

}
