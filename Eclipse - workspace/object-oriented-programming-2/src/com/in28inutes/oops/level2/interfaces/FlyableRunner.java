package com.in28inutes.oops.level2.interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("with wings");
	}
}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");
	}

}


public class FlyableRunner {

	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Plane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}

	}

}
