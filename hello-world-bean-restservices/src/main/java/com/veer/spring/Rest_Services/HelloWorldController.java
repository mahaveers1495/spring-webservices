package com.veer.spring.Rest_Services;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	
	public String helloWorld()
	{
		return "Hello to Rest World ";
	}

	@GetMapping(path="/hello-world-bean")
	
	public HelloWorldController helloWorldBean()
	{
		return new HelloWorldBean ("Hello World Bean");
	}
	
}
