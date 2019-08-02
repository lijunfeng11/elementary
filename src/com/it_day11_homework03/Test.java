package com.ithiema_day11_homework03;

import java.util.ArrayList;
import java.util.List;

import com.ithiema_day11_homework02.Student;

/*
一、	需求说明：自定义一个学生类，给出成员变量name和age
	使用List集合存储自定义对象并使用增强for进行遍历
	遍历集合的时候，在控制台输出学生对象的成员变量值
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

		// 增强for循环遍历
		for (Student s : list) {
			System.out.println(s.getName()+"--"+s.getAge());
		}

	}
}
