package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

	//developing API
	@GetMapping("/getinfo/{name}/{course}")
	public String getSomeInfo(@PathVariable("name")String name,@PathVariable("course") String course) {
		System.out.println(name+" "+course);
		return "We have received name as query parameter name and ocurse "+name+" "+course;
	}
}
