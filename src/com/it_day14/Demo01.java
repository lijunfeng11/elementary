package com.ithiema_day14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 字符串练习之把集合中的学生对象数据存储到文本文件 
 * 
 * 分析：
 * 1 创建一个学生类
 * 2 创建一个集合对象
 * 3 创建元素对象
 * 4 网集合中添加元素
 * 5 创建高效的输出流
 * 6 遍历集合,拿到每一个对象的数据写入到文件中, 写入的格式为   	姓名,年龄,性别
 * 7 关流
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		// 创建一个集合对象
		ArrayList<Student> list = new ArrayList<>();

		// 创建元素对象
		Student stu1 = new Student("李", 12, "男");
		Student stu2 = new Student("程", 15, "女");
		
		//添加元素
		list.add(stu1);
		list.add(stu2);
		
		//创建输出流
		BufferedWriter bw=new BufferedWriter(new FileWriter("student.txt"));
		//遍历集合遍历集合,拿到每一个对象的数据写入到文件中, 写入的格式为   	姓名,年龄,性别
		for (Student s : list) {
			String stu = s.getName()+","+s.getAge()+","+s.getSex();
			bw.write(stu);
			bw.newLine();
			bw.flush();
		}
		
		//关流
		bw.close();
	}
}
