package com.itheima_总结;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 字符流的练习之把文本文件中的字符串数据读取到集合
 * 
 * 
 * 	分析 : 
 * 		1 创建集合对象
 * 		2 创建高效的字符输入流对象
 * 		3 使用高效的字符输入流一次读一行数据, 再把读到的数据存储到集合中
 * 		4 关流
 * 		5 遍历集合
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<String> list = new ArrayList<>();
  
		// 创建高效的字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("Teacher.txt"));
		
		// 使用高效的字符输入流一次读一行数据, 再把读到的数据存储到集合中

		String line;// 记录的是每次读到的一行的数据
		
		while((line = br.readLine()) != null){
			list.add(line);
		}
		
		// 关流
		br.close();
		
		// 遍历集合
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}
