package com.thorabh.shoply.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@GetMapping("/fetch")
	public String getUsers()
	{
		return "user data";
	}
	

}
