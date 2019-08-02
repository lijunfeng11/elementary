package com.itheima_总结;

import java.util.ArrayList;

public class Demo9 {
	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<>();

		Student1 s1 = new Student1("张三", 23);
		Student1 s2 = new Student1("李四", 24);
		Student1 s3 = new Student1("王五", 25);

		list.add(s1);
		list.add(s2);
		list.add(s3);

		for (int i = 0; i < list.size(); i++) {
			Student1 s = list.get(i);

			if (s.getName().equals("李四")) {
				s.setAge(50);
			}
		}

		System.out.println(list);
	}
}
