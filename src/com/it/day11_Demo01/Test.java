package com.itheima.day11_Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// �������϶���
		Collection<Student> s = new ArrayList<>();
		// ����Ԫ�ض���
		Student student = new Student("��", 1);
		Student student2 = new Student("��", 2);
		Student student3 = new Student("��", 3);
		// ���Ԫ��
		s.add(student);
		s.add(student2);
		s.add(student3);
		// ��������
		// ��������

		Iterator<Student> it = s.iterator();

		while (it.hasNext()) {
			Student next = it.next();
			// System.out.println(next);
			System.out.println(next.getName() + "--" + next.getAge());

		}

		/*
		 * ��ǿfor����forѭ����һ�� ��ʽ�� for(Ԫ�ص��������� ������ : ����������Collection���϶�����) {
		 * ʹ�ñ��������ɣ�����������������ʵ�����������Collection�����е�Ԫ�� } �ô������������Collection���ϵı���
		 * �׶ˣ�Ŀ�겻��Ϊnull����α�֤��?�ڱ���ǰ�ȶ�Ŀ����в�Ϊnull���жϡ�
		 * 
		 */
		for (Student it1 : s) {
			// System.out.println(it1.getName() + it1.getAge());
			
		}

	}
}
