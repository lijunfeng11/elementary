package com.ithiema_day12_homework02;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
	三、	需求说明：自定义一个学生类，给出成员变量name和age，创建HashMap集合键是String
		表学号，值是自定义学生对象，代表每一个学生，给集合中添加一些元素，并使用两种方式遍历HashMap集合。
 */
public class Test {
	public static void main(String[] args) {
		// 创建HashMap集合对象
		HashMap<String, Student> hm = new HashMap<>();

		// 创建学生类对象
		Student s1 = new Student("张三", 13);
		Student s2 = new Student("李四", 14);

		// 添加
		hm.put("it001", s1);
		hm.put("it002", s2);

		// 遍历
		// 键找值
		Set<String> set = hm.keySet();
		for (String key : set) {
			Student value = hm.get(key);
			System.out.println(key+"---"+value);
		}
		
		System.out.println("----------------------");
		//键值对对象
		
		Set<Entry<String,Student>> entrySet = hm.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key+"---"+value.getName()+"--"+value.getAge());
		}
	}
}
