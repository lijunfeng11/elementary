package com.ithiema_day11_homework02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	自定义一个学生类，给出成员变量name和age，使用List集合存储自定义对象并遍历
	遍历集合的时候,在控制台输出学生对象的成员变量值。要求使用两种方式进行遍历(迭代器、普通for)
 */
public class Test {
	public static void main(String[] args) {
		// 创建集合对象
		List<Student> list = new ArrayList<Student>();

		// 创建集合元素
		Student student = new Student("李", 12);
		Student student1 = new Student("军", 12);

		// 添加元素
		list.add(student);
		list.add(student1);

		// 用迭代器进行遍历
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);
		}
		System.out.println("---------------");
		// 用for普通循环遍历

		for (int i = 0; i < list.size(); i++) {
			Student student2 = list.get(i);
			System.out.println(student2);
		}
	}
}
