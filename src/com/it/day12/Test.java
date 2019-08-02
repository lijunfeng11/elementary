package com.itheima.day12;

import java.util.HashSet;

/*
 * Set
 */
public class Test {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		
		Student student = new Student("ll", 12);
		Student student2 = new Student("ll", 12);
		
		hs.add(student);
		hs.add(student2);
		
		for (Student s : hs) {
			System.out.println(s);
		}
		
	}
}
