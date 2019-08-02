package com.itheima_�ܽ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �ַ�������ϰ֮�Ѽ����е�ѧ���������ݴ洢���ı��ļ�
 * 
 * 		���� : 
 * 			1 �ȶ���һ����Student
 * 			2 �������϶���
 * 			3 ����Ԫ�ض���
 * 			4 �����������Ԫ��
 * 			5 ������Ч���ַ������
 * 			6 ��������,�õ�ÿһ�����������д�뵽�ļ���, д��ĸ�ʽΪ   	����,����,�Ա�,��ַ
 * 			7 ����
 * �ı��ļ��� :
 * ����,����,�Ա�,��ַ
 * ����,����,�Ա�,��ַ
 * ����,����,�Ա�,��ַ
 * ����,����,�Ա�,��ַ
 * ...
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		// �������϶���
		ArrayList<Student> list = new ArrayList<>();

		// ����Ԫ�ض���
		Student s1 = new Student("�����Ȱ�", 17, "Ů", "�½�");
		Student s2 = new Student("��������", 18, "Ů", "�½�");
		Student s3 = new Student("�������", 19, "��", "���");
		Student s4 = new Student("��Ƥɳ��", 20, "��", "����");

		// �����������Ԫ��
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// ������Ч���ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));

		// ��������,�õ�ÿһ�����������д�뵽�ļ���, д��ĸ�ʽΪ ����,����,�Ա�,��ַ
//		for (Student s : list) {
//			String stu = s.getName() + "," + s.getAge() + "," + s.getSex() + "," + s.getAddress();
//			bw.write(stu);
//			bw.newLine();
//			bw.flush();
//		}
		for (Student s : list) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getSex()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		// ����
		bw.close();
	}
}
