package com.mahaveer.springboot.spring_boot_practise;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootPractiseApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringBootPractiseApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) 
		{
			System.out.println(name);
		}
	}
}
