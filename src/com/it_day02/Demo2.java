package com.itheima_day02;

import java.util.Scanner;

/*����¼��һ��ѧ���ɼ�(int����),����ɼ����ڵ���60���������,����ɼ�С��60�����������*/
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ɼ�");
		int nextInt = sc.nextInt();
		// if(nextInt>=60) {
		// System.out.println("����");
		// }
		// else {
		// System.out.println("������");
		// }
		//
		String num1 = (nextInt >= 60) ? "����" : "������";
		System.out.println(num1);

	}
}
