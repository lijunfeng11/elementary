package com.ithiema_day12_homework01;

import java.util.HashSet;

/*
	 һ������˵�����Զ���һ��ѧ���࣬������Ա����name��age��ʹ��HashSet���ϴ洢�Զ�����󲢱�����
		�������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��Ҫ��ʹ�����ַ�ʽ���б���(����������ǿfor)��
	����	���������ݽ������Ժ���������д洢��ѧ�������������������ͬ����Ϊ��ͬһ���ˣ��Ͳ��洢�ڼ����У���������ء�

 */
public class Test {
	public static void main(String[] args) {
		// ��������HashSet����
		HashSet<Student> hs = new HashSet<>();
		// ����ѧ�������
		Student s1 = new Student("����", 12);
		Student s2 = new Student("����", 4);
		//��дhashCode()  ��equals() �Ϳ���ʵ�ֲ�����ͬһ��
		Student s3 = new Student("����", 4);
		//���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		//����
		for (Student s : hs) {
			int age = s.getAge();
			String name = s.getName();
			System.out.println(name+"---"+age);
		}
	}
}
