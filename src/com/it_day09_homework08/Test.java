package com.ithiema_day09_homework08;

import java.util.Scanner;

/*
	分析以下需求,并用代码实现  
	1.键盘录入一个源字符串由字符串变量scrStr接收
	2.键盘录入一个要删除的字符串由字符串变量delStr接收
	3.要求删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr）
		要求打印删除后的结果以及删除了几个delStr字符串
	4.代码运行打印格式:
		请输入源字符串:java woaijava,i like jajavava i enjoy java
		请输入要删除的字符串:java
		控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  i enjoy

 */
public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 键盘录入对象
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入源字符串：");
		String scrStr = sc.nextLine();

		System.out.println("请输入要删除的串：");
		String delStr = sc.nextLine();

		int count = 0;
		while (scrStr.contains(delStr)) {
			//public String replaceFirst​(String regex, String replacement)
			//用给定的替换替换与给定的regular expression匹配的此字符串的第一个子字符串
			scrStr = scrStr.replaceFirst(delStr, "");
			count++;
		}
		System.out.println(scrStr.trim()+"\njava"+count+"次");
	}
}
