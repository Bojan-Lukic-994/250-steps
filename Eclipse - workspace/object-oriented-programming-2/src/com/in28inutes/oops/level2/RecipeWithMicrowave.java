package com.in28inutes.oops.level2;

public class RecipeWithMicrowave extends Abstractrecipe {

	@Override
	void getReady() {
		System.out.println("Get materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void dotheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it into the microwave");
	}

	@Override
	void cleanup() {
		System.out.println("Clean up");
		System.out.println("Switch off the microwave");
	}

}
