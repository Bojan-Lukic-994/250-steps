package com.in28inutes.oops.level2.inheritance;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("av av");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("meow");
	}
}


public class AnnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog()};
		for (Animal animal : animals) {
			animal.bark();
		}
		
	}

}
