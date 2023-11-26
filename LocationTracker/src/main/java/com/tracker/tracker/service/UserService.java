package com.tracker.tracker.service;

import java.util.List;

import com.tracker.tracker.entity.Users;

public interface UserService {

	
	public Users getUser(String userEmail , String userPassword);
	public Users addUser(Users user);
	public Users updateUser(Users user);
	public void deleteUser(String userEmail);
}
