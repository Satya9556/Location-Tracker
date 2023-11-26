package com.tracker.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracker.tracker.entity.Users;

public interface UserDao extends JpaRepository<Users , String> {
	
	@Query(value = "SELECT * FROM user WHERE email=? and password=? ",nativeQuery = true)
    public Users findByUsername(String email , String password);
	
	@Query(value = "SELECT * FROM user WHERE email=?",nativeQuery = true)
    public Users getByUserEmail(String email );
}
