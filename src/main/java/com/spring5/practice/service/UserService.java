package com.spring5.practice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring5.practice.model.User;
@Service
public class UserService {

	private List<User> users;
	
	
	
	public UserService(List<User> users) {
		this.users = users;
	}

	public User createUser(String name) {
		var user = new User();
		user.setName(name);
		users.add(user);
		return user;
	}
	
	public void removeUserByName(String name) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().equals(name)) {
				iterator.remove();
			}
		}
	}
	
	public void showAll() {
		users.forEach(System.out::println);
	}
}
