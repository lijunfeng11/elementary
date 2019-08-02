package com.ithiema_day11_homework01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
	自定义一个学生类，给出成员变量name和age
	使用Collection集合存储自定义对象并遍历
	遍历集合的时候，在控制台输出学生对象的成员变量值
 */
public class Test {
	public static void main(String[] args) {
		// 创建集合对象
		Collection<Student> list = new ArrayList<Student>();

		// 创建元素对象
		Student student = new Student("李", 12);
		Student student2 = new Student("jun", 12);

		// 添加
		list.add(student);
		list.add(student2);

		// 遍历 使用迭代
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);
		}

	}
}
