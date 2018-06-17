package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {

		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	// Calculate the number of marks.
	public int getNumberOfMarks() {
		return marks.size();
	}

	// Calculate the total sum of marks.
	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	// Count the maximum mark.
	public int getMaximumMark() {
		return Collections.max(marks);
		}

	// Count the minimum mark.
	public int getMiniumMark() {
		return Collections.min(marks);
	}

	// Calculate the average mark.
	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	// Add new mark.
	public void addNewMark(int mark) {
		marks.add(mark);
	}
	
	@Override
	public String toString() {
		return name + marks;
	}

	// Remove the mark at selected index.
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
