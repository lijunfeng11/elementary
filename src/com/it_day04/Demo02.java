package com.itheima_day04;

import java.util.Random;
import java.util.Scanner;

/*
 	定义一个长度为3的一维数组,给每个元素赋值. (要求数组中每个元素的值是0-9的随机数)
	遍历数组打印每个元素的值

 */

public class Demo02 {
	public static void main(String[] args) {
		// 定义一个长度为3的一维数组
		int[] arr = new int[3];
		
		// 给每个元素赋值. (要求数组中每个元素的值是0-9的随机数)
		// 生成随机数对象
		Random r = new Random();
		for (int j = 0; j < arr.length; j++) {
			// 存储随机数
			int num = r.nextInt(10);
			arr[j] = num;
			// System.out.println(arr[j]);
		}
		// 遍历数组里面的元素
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		/*System.out.println("-----------------");
		// 用键盘录入给数组赋值
		// 创建数组
		int[] arr2 = new int[5];

		// 创建数组录入对象
		Scanner sc = new Scanner(System.in);

		// 遍历给每个元素赋值
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素");
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("数组arr2中的元素为：" + arr2[i]);
		}*/

	}
}
