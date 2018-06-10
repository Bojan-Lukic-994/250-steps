package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerScience = new Book(500);
		Book effectiveJava = new Book(300);
		Book cleanCode = new Book(200);

		// artOfComputerScience.setNoOfCopies(5);
		// effectiveJava.setNoOfCopies(10);
		// cleanCode.setNoOfCopies(15);

		artOfComputerScience.increasenoOfCopies(200);
		effectiveJava.increasenoOfCopies(50);
		cleanCode.increasenoOfCopies(15);


	}

}
