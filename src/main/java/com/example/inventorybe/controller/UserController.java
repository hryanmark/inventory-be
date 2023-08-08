package com.example.inventorybe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventorybe.model.UserEntity;
import com.example.inventorybe.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping
	public List<UserEntity> findAllUsers(){
		return userService.findAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<UserEntity> findUserById(@PathVariable("id") Long id){
		return userService.findUserById(id);
	}
	
	@PutMapping
	public UserEntity updateUserEntity(@RequestBody UserEntity user) {
		return userService.saveUser(user);
	}
	
	@PostMapping
	public UserEntity saveUserEntity(@RequestBody UserEntity user) {
		return userService.saveUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
	}
}
