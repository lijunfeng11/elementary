package com.ithiema_day11_homework02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	�Զ���һ��ѧ���࣬������Ա����name��age��ʹ��List���ϴ洢�Զ�����󲢱���
	�������ϵ�ʱ��,�ڿ���̨���ѧ������ĳ�Ա����ֵ��Ҫ��ʹ�����ַ�ʽ���б���(����������ͨfor)
 */
public class Test {
	public static void main(String[] args) {
		// �������϶���
		List<Student> list = new ArrayList<Student>();

		// ��������Ԫ��
		Student student = new Student("��", 12);
		Student student1 = new Student("��", 12);

		// ���Ԫ��
		list.add(student);
		list.add(student1);

		// �õ��������б���
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);
		}
		System.out.println("---------------");
		// ��for��ͨѭ������

		for (int i = 0; i < list.size(); i++) {
			Student student2 = list.get(i);
			System.out.println(student2);
		}
	}
}
