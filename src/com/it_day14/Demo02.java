package com.ithiema_day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 字符流的练习把文本文件中的学生对象数据读取到集合中
 * 
 * 
 * 分析：
 * 1.创建集合对象
 * 2.创建高效的字符输入流对象
 * 3.每次读取一行数据,用切割 创建学生对象,对其设置数据值, 把对象添加到集合中
 * 4.关流
 * 5.遍历集合
 * 
 * 
 */
public class Demo02 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<Student> list = new ArrayList<>();
		
		//创建高效的字符输入流对象
		BufferedReader br=new BufferedReader(new FileReader("student.txt"));
		
		//每次读取一行数据,用切割 创建学生对象,对其设置数据值, 把对象添加到集合中
		String line;
		while((line=br.readLine())!=null) {
			String[] split = line.split(",");
			Student s=new Student(split[0], Integer.parseInt(split[1]), split[2]);
			list.add(s);
		}
		//关流
		br.close();
		
		//遍历集合
		
		for (Student s : list) {
			System.out.println(s);
			System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getSex());
		}
	}
}
