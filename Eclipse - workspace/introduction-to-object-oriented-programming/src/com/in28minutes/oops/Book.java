package com.in28minutes.oops;

public class Book {

	private int noOfCopies;

	Book(int noOfCopies) {

		this.noOfCopies = noOfCopies;

	}
	void setNoOfCopies(int noOfCopies) {

		this.noOfCopies = noOfCopies;

		System.out.println(noOfCopies);
	}

	public void increasenoOfCopies(int howMuch) {

		if (noOfCopies > 0) {
			setNoOfCopies(this.noOfCopies + howMuch);
		}

	}

	public void decreasenoOfCopies(int howMuch) {

		setNoOfCopies(this.noOfCopies - howMuch);

	}
}

