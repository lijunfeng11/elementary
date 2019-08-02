package com.itheima.day12_01;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * HashMap<String, Student>
 */
public class Test {
	public static void main(String[] args) {
		//�������������
		HashMap<String, Student> map=new HashMap<>();
		
		//�����������
		Student s1= new Student("����", 31);
		Student s2= new Student("����", 30);
		Student s3= new Student("ղķ˹",35);
		
		//���Ԫ��
		map.put("it001", s1);
		map.put("it002", s2);
		map.put("it003", s3);
		
		//����
		//����ֵ
		Set<String> set = map.keySet();
		for (String key : set) {
			Student value = map.get(key);
			System.out.println(key+"---"+value);
		}
		
		
		System.out.println("--------------------");
		
		//��ֵ�Զ����Ҷ�Ӧ��
		
		Set<Entry<String,Student>> set2 = map.entrySet();
		for (Entry<String, Student> entry : set2) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key+"----"+value.getName()+"---"+value.getAge());
			
		}
		
		
	}
}
