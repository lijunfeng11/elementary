package com.itheima.day10;

import java.util.Arrays;

/*
"20 10 40 30 50"--"10 20 30 40 50"
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "20 100 40 30 50";
		
		// ���ַ��������и�����ַ�������
		String[] split = s.split(" ");
		//���ַ���ת����int��������
		int[] arr=new int[split.length];
		//��������
		for (int i = 0; i < arr.length; i++) {
			//��String--int
			arr[i]=Integer.parseInt(split[i]);
		}
		//��sort()����������������
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		//����������д�ӡ
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
