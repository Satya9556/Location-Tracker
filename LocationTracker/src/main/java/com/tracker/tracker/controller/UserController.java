package com.tracker.tracker.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.tracker.service.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/getuser/{email}/{password}")
	public User getUser(@PathVariable String email , @PathVariable String password) {
		return null;
		
	}
	
	@PutMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return null;
		
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return null;
		
	}
	
	@DeleteMapping("/deleteuser/{userEmail}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userEmail){
		try {
			this.userService.deleteUser(userEmail);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
