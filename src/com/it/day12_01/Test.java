package com.itheima.day12_01;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * HashMap<String, Student>
 */
public class Test {
	public static void main(String[] args) {
		//创建集合类对象
		HashMap<String, Student> map=new HashMap<>();
		
		//创建子类对象
		Student s1= new Student("库里", 31);
		Student s2= new Student("哈登", 30);
		Student s3= new Student("詹姆斯",35);
		
		//添加元素
		map.put("it001", s1);
		map.put("it002", s2);
		map.put("it003", s3);
		
		//遍历
		//键找值
		Set<String> set = map.keySet();
		for (String key : set) {
			Student value = map.get(key);
			System.out.println(key+"---"+value);
		}
		
		
		System.out.println("--------------------");
		
		//键值对对象找对应的
		
		Set<Entry<String,Student>> set2 = map.entrySet();
		for (Entry<String, Student> entry : set2) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key+"----"+value.getName()+"---"+value.getAge());
			
		}
		
		
	}
}
