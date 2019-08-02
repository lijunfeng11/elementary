package com.ithiema_day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws Exception {
		// 缓冲字符流一次读取一个字符串
		// method1();
		// 缓冲字符流一次读写一个字符数组
		// method2();
		// 缓冲字符串一次读写一个字符
		// method3();

		// 一次读写一个字符
		// 一次读写一个字符数组
		// method4();

	}

	private static void method4() throws IOException {
		// 创建字符输入流
		BufferedReader br = new BufferedReader(new FileReader("Father.java"));
		// 创建字符输入流
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.java"));

		// 一次读写一个字符

		// int ch;
		// while((ch=br.read())!=-1) {
		// bw.write(ch);
		// }

		// 一次读写一个字符数组
		char[] ch = new char[1024];
		int len;
		while ((len = br.read(ch)) != -1) {
			bw.write(ch, 0, len);

		}

		// 释放资源
		br.close();
		bw.close();

	}

	private static void method1() throws Exception {
		// 创建一个缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// 创建一个缓冲流输出
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// 缓冲字符流一次读取一个字符串
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// 关流
		br.close();
		bw.close();

	}

	private static void method2() throws Exception {

		// 创建一个缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// 创建一个缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// 缓冲字符流一次读写一个字符数组
		char[] ch = new char[1024];
		int len;
		while ((len = br.read(ch)) != -1) {
			bw.write(ch, 0, len);
		}

		// 关流
		br.close();
		bw.close();
	}

	private static void method3() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

		// 缓冲字符流一次读写一个字符
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}
		br.close();
		bw.close();

	}

}
