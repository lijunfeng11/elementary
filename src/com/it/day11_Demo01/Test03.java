package com.itheima.day11_Demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		Student s1 = new Student("����", 12);
		Student s2 = new Student("���", 13);
		Student s3 = new Student("��", 14);
		Student s4 = new Student("����", 15);

		// ���Ԫ��
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//����
		//����������
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);
		}
		System.out.println("--------------");
		//��ͨforѭ������
		for(int i=0;i<list.size();i++) {
			Student student = list.get(i);
			System.out.println(student);
			
		}
		
		System.out.println("--------------");
		//��ǿforѭ��
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
