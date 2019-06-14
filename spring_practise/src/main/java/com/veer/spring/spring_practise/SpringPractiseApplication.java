package com.veer.spring.spring_practise;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPractiseApplication 
{

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) 
	{

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringPractiseApplication.class, args);
		BinarySearchImpl binarySearch = 
				(BinarySearchImpl) applicationContext.getBean(BinarySearchImpl.class);
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}
