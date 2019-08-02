package com.itheima_总结;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 字符流的练习之把集合中的学生对象数据存储到文本文件
 * 
 * 		分析 : 
 * 			1 先定义一个类Student
 * 			2 创建集合对象
 * 			3 创建元素对象
 * 			4 往集合中添加元素
 * 			5 创建高效的字符输出流
 * 			6 遍历集合,拿到每一个对象的数据写入到文件中, 写入的格式为   	姓名,年龄,性别,地址
 * 			7 关流
 * 文本文件中 :
 * 姓名,年龄,性别,地址
 * 姓名,年龄,性别,地址
 * 姓名,年龄,性别,地址
 * 姓名,年龄,性别,地址
 * ...
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<Student> list = new ArrayList<>();

		// 创建元素对象
		Student s1 = new Student("迪丽热巴", 17, "女", "新疆");
		Student s2 = new Student("古力娜扎", 18, "女", "新疆");
		Student s3 = new Student("马尔扎哈", 19, "男", "虚空");
		Student s4 = new Student("真皮沙发", 20, "男", "工厂");

		// 往集合中添加元素
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		// 创建高效的字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));

		// 遍历集合,拿到每一个对象的数据写入到文件中, 写入的格式为 姓名,年龄,性别,地址
//		for (Student s : list) {
//			String stu = s.getName() + "," + s.getAge() + "," + s.getSex() + "," + s.getAddress();
//			bw.write(stu);
//			bw.newLine();
//			bw.flush();
//		}
		for (Student s : list) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getSex()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		// 关流
		bw.close();
	}
}
