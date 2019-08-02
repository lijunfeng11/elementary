package com.ithiema_day09_homework09;

import java.util.Arrays;
import java.util.Scanner;

/*
	1.键盘录入一个字符串
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容

 */
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请录入一个字符串");
		
		String s = sc.nextLine();
		char[] chs = new char[s.length()];
		// System.out.println(s.toCharArray());
		
		
		for (int i = 0; i <s.length(); i++) {
			char charAt = s.charAt(i);
			chs[i]=charAt;
		}
		System.out.println(Arrays.toString(chs));
		
	}
}
