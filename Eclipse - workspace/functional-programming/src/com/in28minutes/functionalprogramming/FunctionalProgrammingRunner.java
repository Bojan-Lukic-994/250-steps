package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("apple", "pear", "orange", "dog");
		printWithFPWithFillter(list);
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("og")) {
			System.out.println(string);
		}
	}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

	private static void printWithFPWithFillter(List<String> list) {
		list.stream().filter(element -> element.endsWith("le"))
				.forEach(element -> System.out.println("element - " + element));
	}

}
