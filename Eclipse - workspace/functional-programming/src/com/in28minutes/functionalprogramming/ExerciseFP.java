package com.in28minutes.functionalprogramming;

import java.util.List;

public class ExerciseFP {

	public static void main(String[] args) {
		List<Integer> list = List.of(15, 85, 6963, 3014);
		printWithFP(list);
	}

	private static void printWithFP(List<Integer> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

}
