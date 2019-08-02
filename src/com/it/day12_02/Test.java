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
		//创建HashMap<Student, String>对象
		HashMap<Student, String> map = new HashMap<>();
		
		//创建Student对象
		Student s1= new Student("库里", 31);
		Student s2= new Student("哈登", 30);
		Student s3= new Student("詹姆斯",35);
		
		//添加元素
		map.put(s1, "美国");
		map.put(s2, "美国");
		map.put(s3, "美国");
		
		//遍历
		//键找值
		Set<Student> keySet = map.keySet();
		for (Student key : keySet) {
			String value = map.get(key);
			System.out.println(key+"---"+value);
		}
		System.out.println("-----------");
		
		//通过键值对对象获取值
		Set<Entry<Student,String>> entrySet = map.entrySet();
		for (Entry<Student, String> key : entrySet) {
			
			Student key2 = key.getKey();
			String value = key.getValue();
			System.out.println(key2.getName()+"---"+key2.getAge()+value);
		}
		
	}
}
