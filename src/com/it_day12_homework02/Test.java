package com.ithiema_day12_homework02;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
	����	����˵�����Զ���һ��ѧ���࣬������Ա����name��age������HashMap���ϼ���String
		��ѧ�ţ�ֵ���Զ���ѧ�����󣬴���ÿһ��ѧ���������������һЩԪ�أ���ʹ�����ַ�ʽ����HashMap���ϡ�
 */
public class Test {
	public static void main(String[] args) {
		// ����HashMap���϶���
		HashMap<String, Student> hm = new HashMap<>();

		// ����ѧ�������
		Student s1 = new Student("����", 13);
		Student s2 = new Student("����", 14);

		// ���
		hm.put("it001", s1);
		hm.put("it002", s2);

		// ����
		// ����ֵ
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);
			System.out.println(key+"---"+value);
		}
		
		System.out.println("----------------------");
		//��ֵ�Զ���
		
		Set<Entry<String,Student>> entrySet = hm.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key+"---"+value.getName()+"--"+value.getAge());
		}
	}
}
