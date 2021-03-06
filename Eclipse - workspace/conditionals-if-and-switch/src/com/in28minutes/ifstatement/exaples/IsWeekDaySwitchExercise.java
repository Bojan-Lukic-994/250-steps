package com.in28minutes.ifstatement.exaples;

public class IsWeekDaySwitchExercise {

	public static void main(String[] args) {

		System.out.println(isWeekDay(2));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
		case 6:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}

		return false;
	}
}
