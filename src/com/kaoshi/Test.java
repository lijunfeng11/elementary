package com.kaoshi;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// ������һ�� ArrayList<String> ���� list��
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("��ѧ");
		list.add("Ӣ��");
		list.add("����");
		list.add("����");
		
		//����һ�� Student ���� stu
		Student stu = new Student("С��");
		//���� RandomSubImpl ����
		RandomSubImpl rs = new RandomSubImpl();
		
		rs.say();
		rs.randomChoose(stu, list);
		stu.showSubjects();
	}
}
