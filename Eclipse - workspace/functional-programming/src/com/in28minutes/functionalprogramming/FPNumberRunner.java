package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(4, 2, 6, 15, 27, 1);
		// numbers.stream().forEach(element -> System.out.println(element));

		int sum = fpSum(numbers);
		System.out.println(sum);
	}
 
	// prints the sum of all numbers
	@SuppressWarnings("boxing")
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + +number2);
	}

	// prints the sum of all numbers
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}

}
