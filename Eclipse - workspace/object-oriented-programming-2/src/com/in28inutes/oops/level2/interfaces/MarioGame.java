package com.in28inutes.oops.level2.interfaces;

public class MarioGame implements GamingConsole {

	// player jumps
	@Override
	public void up() {
		System.out.println("Jump");
	}

	// player goes down
	@Override
	public void down() {
		System.out.println("Goes down");
	}

	// player goes left
	@Override
	public void left() {
		System.out.println("");
	}

	// player goes right
	@Override
	public void right() {
		System.out.println("Go right");
	}
}