package com.example.emailservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
private String name;
	private String email;
	
	public User() {}
	public User(String name,String email)
	{
		this.name=name;
		this.email=email;
	}
}
