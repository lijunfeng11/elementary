package com.itheima_day04;

import java.util.Random;
import java.util.Scanner;

/*
 	����һ������Ϊ3��һά����,��ÿ��Ԫ�ظ�ֵ. (Ҫ��������ÿ��Ԫ�ص�ֵ��0-9�������)
	���������ӡÿ��Ԫ�ص�ֵ

 */

public class Demo02 {
	public static void main(String[] args) {
		// ����һ������Ϊ3��һά����
		int[] arr = new int[3];
		
		// ��ÿ��Ԫ�ظ�ֵ. (Ҫ��������ÿ��Ԫ�ص�ֵ��0-9�������)
		// �������������
		Random r = new Random();
		for (int j = 0; j < arr.length; j++) {
			// �洢�����
			int num = r.nextInt(10);
			arr[j] = num;
			// System.out.println(arr[j]);
		}
		// �������������Ԫ��
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		/*System.out.println("-----------------");
		// �ü���¼������鸳ֵ
		// ��������
		int[] arr2 = new int[5];

		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ������ÿ��Ԫ�ظ�ֵ
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("�������" + (i + 1) + "��Ԫ��");
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("����arr2�е�Ԫ��Ϊ��" + arr2[i]);
		}*/

	}
}
