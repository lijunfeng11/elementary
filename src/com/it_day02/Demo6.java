package com.itheima_day02;

import java.util.Scanner;

/*
		����¼��ѧ�����Գɼ����ж�ѧ���ȼ�:
			90-100	����
			80-90	��
			70-80	��
			60-70	����
			60����	������*/

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ�");
		int x = sc.nextInt();
		if (x >= 90 && x <= 100) {
			System.out.println("����");
		} else if (x >= 80 && x < 90) {
			System.out.println("��");
		} else if (x >= 70 && x < 80) {
			System.out.println("��");
		} else if (x >= 60 && x < 70) {
			System.out.println("��");
		} else if (x < 60) {
			System.out.println("������");
		} else {
			System.out.println("�ɼ���Ч");
		}
	}
}
