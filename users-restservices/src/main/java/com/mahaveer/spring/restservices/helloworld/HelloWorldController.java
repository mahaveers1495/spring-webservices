package com.mahaveer.spring.restservices.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")

	public String helloWorld()
	{
		return "Hello to Rest World ";
	}

	@GetMapping(path="/hello-world-bean/{id}")
	
	public HelloWorldBean helloWorldBean(@PathVariable String id)
	{
		return new HelloWorldBean (String.format("Hello World %s",id));
	}
	
}