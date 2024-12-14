package com.example.emailservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;

public class UserService {
@Autowired
private UserRespository userRespository;
@Autowired
private EmailService emailService;
@Transactional
public User saveUser(User user)
{
	User savedUser=userRespository.save(user);
	emailService.sendwelcomeEmail(savedUser);
	return savedUser;
}
public List<User>getAllUsers()
{
	return userRespository.findAll();
}
public User getUserById(Long id)
{
	return userRespository.findByEmail(null);
	
}
public User getUserByEmail(String email)
{
	return userRespository.findByEmail(email);
}
@Transactional
public void deleteUser(long id)
{
	userRespository.deleteById(id);
}
}
