package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping()
	public String getUsers() {
		return "HTTP GET request was sent";
	}
	
	@PostMapping()
	public String createUsers(){
		return "HTTP POST request was sent";
	}
	@DeleteMapping()
	public String deleteUsers(){
		return "HTTP DELETE request was sent";
	}
	@PutMapping()
	public String updateUsers(){
		return "HTTP PUT request was sent";
	}
	
}
