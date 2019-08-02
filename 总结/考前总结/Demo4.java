package com.itheima_�ܽ�;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �ַ�������ϰ֮���ı��ļ��е�ѧ���������ݶ�ȡ������
 * 
 * 	���� : 
 * 		1 �������϶���
 * 		2 ������Ч���ַ�����������
 * 		3 ÿ�ζ�ȡһ������, �����ݽ����и� , ����ѧ������,������������ֵ, �Ѷ�����ӵ�������
 * 		4 ����
 * 		5 ��������
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
		// �������϶���
		ArrayList<Student> list = new ArrayList<>();
		
		// ������Ч���ַ�����������
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		
		// ÿ�ζ�ȡһ������, �����ݽ����и� , ����ѧ������,������������ֵ, �Ѷ�����ӵ�������
		String line; // ��¼����ÿ�ζ�����һ������		 "�����Ȱ�,17,Ů,�½�"
		while((line = br.readLine()) != null){
			String[] stus = line.split(",");// {"�����Ȱ�" , "17" , "Ů" , "�½�"}
			Student s = new Student(stus[0], Integer.parseInt(stus[1]), stus[2], stus[3]);
			list.add(s);
		}
		
		// ����
		br.close();
		
		for(Student s : list){
			// System.out.println(s);
			System.out.println(s.getName() + "---" + s.getAge() + "---" + s.getSex() + "---" + s.getAddress());
		}
	}
}
