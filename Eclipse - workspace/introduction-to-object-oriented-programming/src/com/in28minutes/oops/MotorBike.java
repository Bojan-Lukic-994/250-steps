package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	// constructors
	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;

	}

	// behaviour
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}


	void start() {
		System.out.println("Bike started");

	}

}
