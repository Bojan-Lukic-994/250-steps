package com.in28minutes.exceptiohandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try {
		scanner = new Scanner(System.in);
		int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[21];

		scanner.close();

	} catch(Exception e) {
		e.printStackTrace();
	} finally {
			System.out.println("Before Scanner close");
			if(scanner != null) {
			scanner.close();
	}

		System.out.println("Before closing out main");

	}
}
}