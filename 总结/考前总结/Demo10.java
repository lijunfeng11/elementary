package com.itheima_�ܽ�;

public class Demo10 {
	public static void main(String[] args) {
		Dog d = new Dog("��ë", "��ɫ");
		System.out.println(d.getBreed() + "---" + d.getColor());
		d.eat();
		d.swimming();

		System.out.println("---------");

		Cat c = new Cat();
		c.setBreed("Ӣ��");
		c.setColor("�ڰ�");
		System.out.println(c.getBreed() + "---" + c.getColor());
		c.eat();
	}
}
