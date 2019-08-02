package com.itheima_×Ü½á;

public class Dog extends Animal implements Swim {
	// alt + shift + c
	public Dog() {
	}

	public Dog(String breed, String color) {
		super(breed, color);
	}

	@Override
	public void swimming() {
		System.out.println("¹·ÅÙ!");

	}

	@Override
	public void eat() {
		System.out.println("¹·³Ô¹ÇÍ·!");
	}

}
