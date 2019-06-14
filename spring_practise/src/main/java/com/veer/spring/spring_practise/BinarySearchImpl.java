package com.veer.spring.spring_practise;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.veer.spring.spring_practise.SortAlgorithm;

@Component
public class BinarySearchImpl 
{

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) 
	{

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

}
