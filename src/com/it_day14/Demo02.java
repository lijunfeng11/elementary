package com.ithiema_day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �ַ�������ϰ���ı��ļ��е�ѧ���������ݶ�ȡ��������
 * 
 * 
 * ������
 * 1.�������϶���
 * 2.������Ч���ַ�����������
 * 3.ÿ�ζ�ȡһ������,���и� ����ѧ������,������������ֵ, �Ѷ�����ӵ�������
 * 4.����
 * 5.��������
 * 
 * 
 */
public class Demo02 {
	public static void main(String[] args) throws IOException {
		// �������϶���
		ArrayList<Student> list = new ArrayList<>();
		
		//������Ч���ַ�����������
		BufferedReader br=new BufferedReader(new FileReader("student.txt"));
		
		//ÿ�ζ�ȡһ������,���и� ����ѧ������,������������ֵ, �Ѷ�����ӵ�������
		String line;
		while((line=br.readLine())!=null) {
			String[] split = line.split(",");
			Student s=new Student(split[0], Integer.parseInt(split[1]), split[2]);
			list.add(s);
		}
		//����
		br.close();
		
		//��������
		
		for (Student s : list) {
			System.out.println(s);
			System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getSex());
		}
	}
}
