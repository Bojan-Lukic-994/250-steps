package com.in28inutes.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {

		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();

		}

		// GamingConsole game = new ChessGame();
		// MarioGame game = new MarioGame();
		// ChessGame game = new ChessGame();

		// game.up();
		// game.down();
		// game.left();
		// game.right();

	}

}