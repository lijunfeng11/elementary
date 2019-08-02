package com.itheima.day10;

import java.util.Arrays;

/*
"20 10 40 30 50"--"10 20 30 40 50"
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// 定义一个字符串
		String s = "20 100 40 30 50";
		
		// 对字符串进行切割，返回字符串数组
		String[] split = s.split(" ");
		//把字符串转换成int类型数组
		int[] arr=new int[split.length];
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			//将String--int
			arr[i]=Integer.parseInt(split[i]);
		}
		//用sort()方法进行升序排序
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		//遍历数组进行打印
		for (int i = 0; i < arr.length; i++) {
			if(i==arr[i]) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]+" ");
			}
		}
		
		System.out.println(sb);
		
	}
}
