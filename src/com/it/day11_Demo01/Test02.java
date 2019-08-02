package com.itheima.day11_Demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		// 创建List集合对象
		List<Student> list = new ArrayList<>();

		Student s1 = new Student("貂蝉", 12);
		Student s2 = new Student("李冲", 12);
		Student s3 = new Student("锋", 12);
		Student s4 = new Student("建键", 12);

		// 添加元素
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 迭代器遍历
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);

		}

		System.out.println("--------------");

		// 普通for遍历
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			System.out.println(student.getName() + "----" + student.getAge());
		}

		System.out.println("---------------");

		// 增强for循环
		for (Student s : list) {

			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
}
