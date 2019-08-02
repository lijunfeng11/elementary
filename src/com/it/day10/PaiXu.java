package com.itheima.day10;

import java.util.Arrays;

public class PaiXu {
	public static void main(String[] args) {
		int[] arr = { 34, 5, 7, 45, 13 };
		System.out.print("排序之前");
		printArray(arr);
		bubbleSort(arr);
		System.out.print("排序后");
		
		printArray(arr);
		
	}

	// 遍历数组
	public static void printArray(int[] arr) {
		System.out.print("\n[");
		for (int i = 0; i < arr.length; i++) {
			
			if(i==arr.length-1) {
				System.out.print(arr[i]+"]");
			}else {
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println("\n");
		
		
		
	}

	// 数组排序的方法
	public static void bubbleSort(int[] arr) {
		// 循环会比较几轮 如果要是五个数就会比较4论
		for (int i = 0; i < arr.length - 1; i++) {
			// 循环控制每一轮中的元素下标位置，每结束一轮就会出来一个当前这轮中的最大值，
			// 则减i,之所以再减1，是因为最后剩一个元素的时候没有相邻的数与其分组，所以不用再比较了
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序后");
			printArray(arr);//每轮结束后打印数组元素
		}
	}
}
