package com.itheima_总结;

public class Demo10 {
	public static void main(String[] args) {
		Dog d = new Dog("金毛", "黄色");
		System.out.println(d.getBreed() + "---" + d.getColor());
		d.eat();
		d.swimming();

		System.out.println("---------");

		Cat c = new Cat();
		c.setBreed("英短");
		c.setColor("黑白");
		System.out.println(c.getBreed() + "---" + c.getColor());
		c.eat();
	}
}
