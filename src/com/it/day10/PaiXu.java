package com.itheima.day10;

import java.util.Arrays;

public class PaiXu {
	public static void main(String[] args) {
		int[] arr = { 34, 5, 7, 45, 13 };
		System.out.print("����֮ǰ");
		printArray(arr);
		bubbleSort(arr);
		System.out.print("�����");
		
		printArray(arr);
		
	}

	// ��������
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

	// ��������ķ���
	public static void bubbleSort(int[] arr) {
		// ѭ����Ƚϼ��� ���Ҫ��������ͻ�Ƚ�4��
		for (int i = 0; i < arr.length - 1; i++) {
			// ѭ������ÿһ���е�Ԫ���±�λ�ã�ÿ����һ�־ͻ����һ����ǰ�����е����ֵ��
			// ���i,֮�����ټ�1������Ϊ���ʣһ��Ԫ�ص�ʱ��û�����ڵ���������飬���Բ����ٱȽ���
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("��"+(i+1)+"�������");
			printArray(arr);//ÿ�ֽ������ӡ����Ԫ��
		}
	}
}
