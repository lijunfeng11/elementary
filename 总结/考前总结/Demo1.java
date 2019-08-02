package com.itheima_总结;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 字符流的练习之把集合中的字符串数据存储到文本文件
 * 
 * 	分析 : 
 * 		1 创建集合对象ArrayList
 * 		2 往集合中添加元素
 * 		3 创建高效的字符输出流
 * 		4 遍历集合,拿到集合中的每一个数据,使用输出流对象往文件中写入
 * 		5 关流
 * 
 * 文件中的内容:
 * xxx
 * xxx
 * xx
 * xx
 * ...
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象ArrayList
		ArrayList<String> list = new ArrayList<>();

		// 往集合中添加元素
		list.add("乔杉");
		list.add("大鹏");
		list.add("cls");
		list.add("xzls");

		// 创建高效的字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("Teacher.txt"));

		// 遍历集合,拿到集合中的每一个数据,使用输出流对象往文件中写入
//		for(String s : list){
//			bw.write(s);
//			bw.newLine();
//			bw.flush();
//		}
		
		for(int i = 0 ; i < list.size() ; i++){
			String s = list.get(i);
			bw.write(s);
			
			if(i != list.size() - 1 ){
				bw.newLine();
			}
			
			bw.flush();
		}
		
		bw.close();
	}
}
