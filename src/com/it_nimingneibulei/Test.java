package com.ithiema_nimingneibulei;
/*
 * �����ڲ���
 */

public class Test {
	public static void main(String[] args) {
		animalShout(new Animal() {
			
			@Override
			public void show() {
				System.out.println("����.....");
				
			}
		});
	}
	//����һ��animalShout��
	public static void animalShout (Animal an) {
		an.show();
	}
}