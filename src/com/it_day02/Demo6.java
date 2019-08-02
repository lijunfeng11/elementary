package com.itheima_day02;

import java.util.Scanner;

/*
		键盘录入学生考试成绩，判断学生等级:
			90-100	优秀
			80-90	好
			70-80	良
			60-70	及格
			60以下	不及格*/

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		int x = sc.nextInt();
		if (x >= 90 && x <= 100) {
			System.out.println("优秀");
		} else if (x >= 80 && x < 90) {
			System.out.println("好");
		} else if (x >= 70 && x < 80) {
			System.out.println("良");
		} else if (x >= 60 && x < 70) {
			System.out.println("好");
		} else if (x < 60) {
			System.out.println("不及格");
		} else {
			System.out.println("成绩无效");
		}
	}
}
