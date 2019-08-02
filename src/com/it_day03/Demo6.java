package com.itheima_day03;
import java.util.Random;
import java.util.Scanner;

/*
 * 知识点：循环结构
 * 
 * 需求：
 * 猜数字小游戏
	系统产生一个1-100之间的随机数，请猜出这个数据是多少?

 * 
 */
public class Demo6 {
	public static void main(String[] args) {
		// 创建Random对象
		Random r = new Random();
		// 生成一个随机数1-100之间
		int number = r.nextInt(100) + 1;
		// System.out.println(number);
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		while (true) {

			// 键盘录入数据
			System.out.println("请输入一个数据");
			// 接收数据
			int num = sc.nextInt();

			if (num > number) {
				System.out.println("录入的数"+num+"猜大了");

			} else if (num < number) {

				System.out.println("录入的数"+num+"猜小了");
			} else if (num == number) {

				System.out.println("恭喜您猜对了");
				break;

			}
		}
	}
}
