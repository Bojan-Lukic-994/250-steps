package com.in28inutes.oops.level2;

public abstract class Abstractrecipe {

	public void execute() {
		getReady();
		dotheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void dotheDish();

	abstract void cleanup();

	// preparation
	// recipe
	// cleanup

}
