package com.itheima_day03;

import java.util.Scanner;

/*
 * 
 * while循环的基本格式
 * while(判断条件语句){
 * 循环语句;}
 * 
 * 扩展格式
 * 初始化语句;
 * while(判断条件语句){
 * 循环体语句;
 * 控制条件语句;
 * }
 * 
		1.从键盘上录入一个1到5的数字;
		2.当数字为1时打印菜单"新建";
			当数字为2时打印菜单"打开文件";
			当数字为3时打印菜单"保存";
			当数字为4时打印菜单"刷新";
		 	当数字为5时打印菜单"退出",并退出程序;
			此行代码可以终止java程序运行: System.exit(0);

 */
public class myWhileDemo4 {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入1-5的一位数");
			int nextInt = sc.nextInt();

			switch (nextInt) {
			case 1:
				System.out.println("新建");
				break;
			case 2:
				System.out.println("打开文件");
				break;
			case 3:
				System.out.println("保存");
				break;
			case 4:
				System.out.println("刷新");
				break;
			case 5:
				System.out.println("退出");
				System.exit(0);
//				break;
				
					
			
			}

		}

	}
}
