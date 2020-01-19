package com.spring5.practice;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring5.practice.model.User;
import com.spring5.practice.service.UserService;


@Configuration
public class ServiceInitializer {

	@Bean
	public UserService userService() {
		return new UserService(new ArrayList<User>());
	}
}
