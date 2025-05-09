package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.iGreetingService;

@Controller
public class GreetingController {

	@Autowired
	private iGreetingService service;
	
	@GetMapping("/greet")
	@ResponseBody
	public String generateWish() {
		return service.greeting("Akanksha");
	}
	
	@GetMapping("/greet2")
	@ResponseBody
	public ResponseEntity<String> generateWish2() {
		String response= service.greeting("Yamini");
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
