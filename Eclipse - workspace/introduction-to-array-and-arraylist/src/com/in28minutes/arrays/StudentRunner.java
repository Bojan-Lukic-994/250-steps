package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
	
		Student student = new Student("Ranga", 97, 98, 100);
		
		// Prints the number of marks
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		// Prints the sum of all marks
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);

		// Prints the maximum mark
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks : " + maximumMark);

		// Pritns the minimum mark
		int minimumMark = student.getMiniumMark();
		System.out.println("minimum of marks : " + minimumMark);

		// Prints the average mark
		BigDecimal average = student.getAverageMarks();
		System.out.println("average mark : " + average);

		System.out.println(student);

		// Add new mark to student.
		student.addNewMark(35);
		System.out.println(student);

		// Remove mark at selected index.
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
