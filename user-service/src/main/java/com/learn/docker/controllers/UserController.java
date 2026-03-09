package com.learn.docker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/v1")
public class UserController {

	@GetMapping("/register")
	public ResponseEntity<String> registerUser() {
		return ResponseEntity.ok("Registration Successful...");
	}

}
