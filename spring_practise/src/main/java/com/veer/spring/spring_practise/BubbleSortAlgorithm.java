package com.veer.spring.spring_practise;

import org.springframework.context.annotation.Primary;


import org.springframework.stereotype.Component;

import com.veer.spring.spring_practise.SortAlgorithm;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm
{
	public int[] sort(int[] numbers) 
	{
		// Logic for Bubble Sort
		return numbers;
	}
}
