package com.in28inutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
		fan.swithcOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
