package com.in28minutes.ifstatement.exaples;

public class NameOfMonthRunner {

	public static void main(String[] args) {

		System.out.println(determineNameOfMonth(8));
	}

	public static String determineNameOfMonth(int NameMonth) {
		switch (NameMonth) {
		
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "September";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
		}
		return "Invalid name";
		
	}
}
