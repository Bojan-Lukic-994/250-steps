package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {

		List.of("ant", "bat", "dogo", "elephant").stream()
		        .map(e -> e.length())
			    .forEach(e -> System.out.println(e));
		

		List.of("ant", "bat", "dogo", "elephant").stream()
				.map(String::length)
				.forEach(MethodReferencesRunner::print);


		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);

		System.out.println(max);
	}


	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
