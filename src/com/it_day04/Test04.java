package com.itheima_day04;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		int[] arr = { 1, 22, 3, 4, 5 };

		System.out.print("反转前:[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		// 给数组的元素反转
		for (int startIndex = 0, endIndex = arr.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}

		System.out.print("反转后:[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
