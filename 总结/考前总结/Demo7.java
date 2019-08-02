package com.itheima_总结;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
	一、	分析以下需求，并用代码实现
	需求 : 项目根路径下有text.txt文件，内容如下
	我爱黑马
	123456
	
	利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中
	654321
	马黑爱我

 */
public class Demo7 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader("text.txt"));

		String line;// "123456"
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();

		// System.out.println(list);// {"我爱黑马" ,"123456"}

		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));

		for (int i = list.size() - 1; i >= 0; i--) {
			String s = list.get(i);// "我爱黑马"

			StringBuilder sb = new StringBuilder(s);// 马黑爱我
			sb.reverse();

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.close();
	}

}
