package com.in28inutes.oops.level2;

public class Recipe1 extends Abstractrecipe {

	@Override
	void getReady() {
		System.out.println("Get materials");
		System.out.println("Get the utensils");
	}

	@Override
	void dotheDish() {
		System.out.println("Do the dish");

	}

	@Override
	void cleanup() {
		System.out.println("Clean up");

	}

}
