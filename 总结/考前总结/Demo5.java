package com.itheima_总结;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
	一、	分析以下需求，并用代码实现： 
	实现一个验证码小程序，要求如下：
		1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
		2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败

 */
public class Demo5 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入第" + i + "个验证码:");
			String s = sc.nextLine();
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		bw.close();

		System.out.println("录入一个需要被校验的验证码:");
		String ss = sc.nextLine();

		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		// false : ss在文件中不存在
		boolean flag = false;

		String line;
		while ((line = br.readLine()) != null) {

			if (ss.equals(line)) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("验证成功!");
		} else {
			System.out.println("验证失败!");
		}

		br.close();
	}

}
