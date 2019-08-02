package com.itheima_day04;
/*
 * 已知数组int[] nums = {5,10,15},,要求创建一个新数组
	1.新数组的长度和已知数组相同
	2.新数组每个元素的值 是已知数组对应位置元素的2倍
	3.在控制台中打印新数组的所有元素

 */

public class Demo03 {
	public static void main(String[] args) {
		// 已知数组
		int[] nums = { 5, 10, 15 };

		
		// 创建一个新数组
		int[] num = new int[3];

		// 循环遍历让nums数组中的每个元素都乘2
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
			// 将nums值赋值给num
			num = nums;
		}
		// 遍历输出新数组的所有元素
		for (int i = 0; i < num.length; i++) {
			System.out.println("新数组的元素为：" + num[i]);
		}
		
		
	}
}
