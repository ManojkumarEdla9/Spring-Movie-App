package com.example.emailservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping
	public ResponseEntity<User>createUser(@RequestBody User user)
	{
		User savedUser=userService.saveUser(user);
		return ResponseEntity.ok(savedUser);
	}
	@GetMapping
	public ResponseEntity<List<User>>getAllUsers()
	{
		List<User>users=userService.getAllUsers();
		return ResponseEntity.ok(users);
	}
	@GetMapping("/{id}")
	public ResponseEntity<User>getUserById(@PathVariable long id)
	{
		User user=userService.getUserById(id);
		return user!=null ? ResponseEntity.ok(user):ResponseEntity.notFound().build();
	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteUser(@PathVariable long id)
	{
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
}
