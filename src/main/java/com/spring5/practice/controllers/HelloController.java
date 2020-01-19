package com.spring5.practice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring5.practice.model.User;
import com.spring5.practice.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/show-all")
	public String hello(Model model) {
		model.addAttribute("message", "Showing all users");
		userService.showAll();
		return "index";
	}
	
	@GetMapping("/add-user")
	public String add(@RequestParam("name") String name, Model model) {
		
		userService.createUser(name);
		model.addAttribute("message", "User created successfully");
		return "index";
	}
	
	@GetMapping("/remove-user")
	public String remove(@RequestParam("name") String name, Model model) {
		userService.removeUserByName(name);
		model.addAttribute("message", "User removed successfully");
		return "index";
	}
}
