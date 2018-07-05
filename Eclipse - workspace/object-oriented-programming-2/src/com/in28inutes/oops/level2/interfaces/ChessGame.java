package com.in28inutes.oops.level2.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	// Moves selected figure up
	public void up() {
		System.out.println("Move figure up");
	}

	@Override
	// Moves selected figure down
	public void down() {
		System.out.println("Move figure down");
	}

	@Override
	// Moves selected figure left
	public void left() {
		System.out.println("Move figure left");
	}

	@Override
	// Moves selected figure right
	public void right() {
		System.out.println("Move figure right");
	}
}