package com.ithiema_nimingneibulei;
/*
 * 匿名内部类
 */

public class Test {
	public static void main(String[] args) {
		animalShout(new Animal() {
			
			@Override
			public void show() {
				System.out.println("喵喵.....");
				
			}
		});
	}
	//定义一个animalShout类
	public static void animalShout (Animal an) {
		an.show();
	}
}