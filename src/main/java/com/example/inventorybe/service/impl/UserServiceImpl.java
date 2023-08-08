package com.example.inventorybe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorybe.model.UserEntity;
import com.example.inventorybe.repository.UserRepository;
import com.example.inventorybe.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserEntity> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> findUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public UserEntity saveUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
