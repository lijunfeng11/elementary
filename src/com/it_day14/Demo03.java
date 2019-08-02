package com.ithiema_day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 字符串练习之把集合中的学生对象数据存储到文本文件 
 * 
 * 1.创建学生集合对象
 * 2.创建元素对象
 * 3.添加到集合中
 * 4.创建高效的字符串输入流对象
 * 5.遍历集合拿到每一个对象的数据写到文件中
 * 6.关流
 */
public class Demo03 {

	public static void main(String[] args) throws IOException {
		// 字符流的练习把文本文件中的学生对象数据读取到集合中

		ArrayList<Student> list=new ArrayList<>();
		
		BufferedReader br=new BufferedReader(new FileReader(""));
		
		
	}
}