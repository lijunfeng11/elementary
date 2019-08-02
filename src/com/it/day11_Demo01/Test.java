package com.itheima.day11_Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// 创建集合对象
		Collection<Student> s = new ArrayList<>();
		// 创建元素对象
		Student student = new Student("李", 1);
		Student student2 = new Student("军", 2);
		Student student3 = new Student("锋", 3);
		// 添加元素
		s.add(student);
		s.add(student2);
		s.add(student3);
		// 遍历集合
		// 创建迭代

		Iterator<Student> it = s.iterator();

		while (it.hasNext()) {
			Student next = it.next();
			// System.out.println(next);
			System.out.println(next.getName() + "--" + next.getAge());

		}

		/*
		 * 增强for：是for循环的一种 格式： for(元素的数据类型 变量名 : 数组名或者Collection集合对象名) {
		 * 使用变量名即可，这个变量名代表的其实就是数组或者Collection集合中的元素 } 好处：简化了数组和Collection集合的遍历
		 * 弊端：目标不能为null。如何保证呢?在遍历前先对目标进行不为null的判断。
		 * 
		 */
		for (Student it1 : s) {
			// System.out.println(it1.getName() + it1.getAge());
			
		}

	}
}
