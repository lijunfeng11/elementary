package com.itheima.day10;

import java.util.Arrays;

/*
 * 构造方法私有
 * static修饰c
 * 数组转为字符串
 */
public class Test02 {
	public static void main(String[] args) {
		// 定义一个数组
		int[] arr = { 2, 4, 1, 6 };
		// 调用sort()排序
		Arrays.sort(arr);
		// 进行遍历
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		 System.out.println(Arrays.toString(arr));
	}
}
