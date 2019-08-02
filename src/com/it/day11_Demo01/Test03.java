package com.itheima.day11_Demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		Student s1 = new Student("貂蝉", 12);
		Student s2 = new Student("李冲", 13);
		Student s3 = new Student("锋", 14);
		Student s4 = new Student("建键", 15);

		// 添加元素
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//遍历
		//迭代器遍历
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);
		}
		System.out.println("--------------");
		//普通for循环遍历
		for(int i=0;i<list.size();i++) {
			Student student = list.get(i);
			System.out.println(student);
			
		}
		
		System.out.println("--------------");
		//增强for循环
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
