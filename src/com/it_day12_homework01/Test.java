package com.ithiema_day12_homework01;

import java.util.HashSet;

/*
	 一、需求说明：自定义一个学生类，给出成员变量name和age，使用HashSet集合存储自定义对象并遍历，
		遍历集合的时候，在控制台输出学生对象的成员变量值。要求使用两种方式进行遍历(迭代器、增强for)。
	二、	当上述内容解决完毕以后，如果集合中存储的学生对象，年龄和姓名都相同，认为是同一个人，就不存储在集合中，该如何做呢。

 */
public class Test {
	public static void main(String[] args) {
		// 创建集合HashSet对象
		HashSet<Student> hs = new HashSet<>();
		// 创建学生类对象
		Student s1 = new Student("张三", 12);
		Student s2 = new Student("李四", 4);
		//重写hashCode()  和equals() 就可以实现不出来同一个
		Student s3 = new Student("李四", 4);
		//添加元素
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//遍历
		for (Student s : hs) {
			int age = s.getAge();
			String name = s.getName();
			System.out.println(name+"---"+age);
		}
	}
}
