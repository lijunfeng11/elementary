package com.ithiema_day11_homework01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
	�Զ���һ��ѧ���࣬������Ա����name��age
	ʹ��Collection���ϴ洢�Զ�����󲢱���
	�������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ
 */
public class Test {
	public static void main(String[] args) {
		// �������϶���
		Collection<Student> list = new ArrayList<Student>();

		// ����Ԫ�ض���
		Student student = new Student("��", 12);
		Student student2 = new Student("jun", 12);

		// ���
		list.add(student);
		list.add(student2);

		// ���� ʹ�õ���
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student next = it.next();
			System.out.println(next);
		}

	}
}
