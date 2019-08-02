package com.itheima.day12_02;
/*
 * HashMap<Student, String>
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.itheima.day12_01.Student;

public class Test {
	public static void main(String[] args) {
		//����HashMap<Student, String>����
		HashMap<Student, String> map = new HashMap<>();
		
		//����Student����
		Student s1= new Student("����", 31);
		Student s2= new Student("����", 30);
		Student s3= new Student("ղķ˹",35);
		
		//���Ԫ��
		map.put(s1, "����");
		map.put(s2, "����");
		map.put(s3, "����");
		
		//����
		//����ֵ
		Set<Student> keySet = map.keySet();
		for (Student key : keySet) {
			String value = map.get(key);
			System.out.println(key+"---"+value);
		}
		System.out.println("-----------");
		
		//ͨ����ֵ�Զ����ȡֵ
		Set<Entry<Student,String>> entrySet = map.entrySet();
		for (Entry<Student, String> key : entrySet) {
			
			Student key2 = key.getKey();
			String value = key.getValue();
			System.out.println(key2.getName()+"---"+key2.getAge()+value);
		}
		
	}
}
