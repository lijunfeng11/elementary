package com.ithiema_day12_homework06;

import java.util.HashSet;
import java.util.Scanner;

/*
一、	需求分析：键盘录入字符串,去掉其中重复字符, 打印出不同的那些字符
 */
public class Test {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串");
		//定义一个变量进行接收
		String nextLine = sc.nextLine();
		
		HashSet<String> list = new HashSet<>();
		
		list.add(nextLine);
		
		for (String s : list) {
			
		}
		
		
	}
}
