package com.ithiema_day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �ַ�����ϰ֮�Ѽ����е�ѧ���������ݴ洢���ı��ļ� 
 * 
 * ������
 * 1 ����һ��ѧ����
 * 2 ����һ�����϶���
 * 3 ����Ԫ�ض���
 * 4 �����������Ԫ��
 * 5 ������Ч�������
 * 6 ��������,�õ�ÿһ�����������д�뵽�ļ���, д��ĸ�ʽΪ   	����,����,�Ա�
 * 7 ����
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		// ����һ�����϶���
		ArrayList<Student> list = new ArrayList<>();

		// ����Ԫ�ض���
		Student stu1 = new Student("��", 12, "��");
		Student stu2 = new Student("��", 15, "Ů");
		
		//���Ԫ��
		list.add(stu1);
		list.add(stu2);
		
		//���������
		BufferedWriter bw=new BufferedWriter(new FileWriter("student.txt"));
		//�������ϱ�������,�õ�ÿһ�����������д�뵽�ļ���, д��ĸ�ʽΪ   	����,����,�Ա�
		for (Student s : list) {
			String stu = s.getName()+","+s.getAge()+","+s.getSex();
			bw.write(stu);
			bw.newLine();
			bw.flush();
		}
		
		//����
		bw.close();
	}
}
