package com.itheima.day10;

import java.util.Arrays;

/*
 * ���췽��˽��
 * static����c
 * ����תΪ�ַ���
 */
public class Test02 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 2, 4, 1, 6 };
		// ����sort()����
		Arrays.sort(arr);
		// ���б���
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
