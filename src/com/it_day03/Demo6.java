package com.itheima_day03;
import java.util.Random;
import java.util.Scanner;

/*
 * ֪ʶ�㣺ѭ���ṹ
 * 
 * ����
 * ������С��Ϸ
	ϵͳ����һ��1-100֮������������³���������Ƕ���?

 * 
 */
public class Demo6 {
	public static void main(String[] args) {
		// ����Random����
		Random r = new Random();
		// ����һ�������1-100֮��
		int number = r.nextInt(100) + 1;
		// System.out.println(number);
		// ����Scanner����
		Scanner sc = new Scanner(System.in);
		while (true) {

			// ����¼������
			System.out.println("������һ������");
			// ��������
			int num = sc.nextInt();

			if (num > number) {
				System.out.println("¼�����"+num+"�´���");

			} else if (num < number) {

				System.out.println("¼�����"+num+"��С��");
			} else if (num == number) {

				System.out.println("��ϲ���¶���");
				break;

			}
		}
	}
}
