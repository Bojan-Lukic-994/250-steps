package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {

		// Created array of string with days of the week.
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// Prints the day with most characters.
		String dayWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day wth Most number of characters: " + dayWithMostCharacters);


		// Prints the days of the week in oposite direction (from saturday to sunday).
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
		    System.out.println(daysOfWeek[i]);
	}
}
}
