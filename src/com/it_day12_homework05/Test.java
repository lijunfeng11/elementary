package com.ithiema_day12_homework05;


import java.util.ArrayList;
import java.util.HashSet;

/*
	1.	定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
	2.	利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的大小顺序
	3.	打印新数组中的内容按照以下描述完成类的定义

 */
public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 4, 5, 6, 7, 8, 9, 9 };
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int in : arr) {
			if(list.contains(in)) {
				list.add(in);
			}
		}
		int[] newArr = new int[list.size()];
		// 定义新集合的索引
		int index = 0;
		// 遍历集合，为新数组元素赋值
		for (int in : list) {
			newArr[index++] = in;
		}
		System.out.println(list);
		
	}
}
