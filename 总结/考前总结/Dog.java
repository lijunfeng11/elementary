package com.itheima_�ܽ�;

public class Dog extends Animal implements Swim {
	// alt + shift + c
	public Dog() {
	}

	public Dog(String breed, String color) {
		super(breed, color);
	}

	@Override
	public void swimming() {
		System.out.println("����!");

	}

	@Override
	public void eat() {
		System.out.println("���Թ�ͷ!");
	}

}
