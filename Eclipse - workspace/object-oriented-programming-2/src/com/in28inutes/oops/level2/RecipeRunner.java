package com.in28inutes.oops.level2;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();

		RecipeWithMicrowave micro = new RecipeWithMicrowave();
		micro.execute();

	}

}
