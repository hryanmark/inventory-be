package com.example.inventorybe.service;

import java.util.List;
import java.util.Optional;

import com.example.inventorybe.model.UserEntity;

public interface UserService {
	
	public List<UserEntity> findAllUsers();
	public Optional<UserEntity> findUserById(Long id);
	public UserEntity updateUser(UserEntity user);
	public UserEntity saveUser(UserEntity user);
	public void deleteUser(Long id);
}
