package com.ithiema_day11_homework03;

import java.util.ArrayList;
import java.util.List;

import com.ithiema_day11_homework02.Student;

/*
һ��	����˵�����Զ���һ��ѧ���࣬������Ա����name��age
	ʹ��List���ϴ洢�Զ������ʹ����ǿfor���б���
	�������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ
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

		// ��ǿforѭ������
		for (Student s : list) {
			System.out.println(s.getName()+"--"+s.getAge());
		}

	}
}
