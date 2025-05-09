package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pathController {

	//developing API
	@GetMapping("/getinfo")
	public String getSomeInfo(@RequestParam("n")String name,@RequestParam("c") String course) {
		System.out.println(name+" "+course);
		return "We have received name as query parameter name and ocurse "+name+" "+course;
	}
}
