package com.itheima_day02;

import java.util.Scanner;

/*键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”*/
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩");
		int nextInt = sc.nextInt();
		// if(nextInt>=60) {
		// System.out.println("及格");
		// }
		// else {
		// System.out.println("不及格");
		// }
		//
		String num1 = (nextInt >= 60) ? "及格" : "不及格";
		System.out.println(num1);

	}
}
