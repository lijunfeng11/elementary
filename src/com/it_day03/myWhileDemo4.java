package com.itheima_day03;

import java.util.Scanner;

/*
 * 
 * whileѭ���Ļ�����ʽ
 * while(�ж��������){
 * ѭ�����;}
 * 
 * ��չ��ʽ
 * ��ʼ�����;
 * while(�ж��������){
 * ѭ�������;
 * �����������;
 * }
 * 
		1.�Ӽ�����¼��һ��1��5������;
		2.������Ϊ1ʱ��ӡ�˵�"�½�";
			������Ϊ2ʱ��ӡ�˵�"���ļ�";
			������Ϊ3ʱ��ӡ�˵�"����";
			������Ϊ4ʱ��ӡ�˵�"ˢ��";
		 	������Ϊ5ʱ��ӡ�˵�"�˳�",���˳�����;
			���д��������ֹjava��������: System.exit(0);

 */
public class myWhileDemo4 {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������1-5��һλ��");
			int nextInt = sc.nextInt();

			switch (nextInt) {
			case 1:
				System.out.println("�½�");
				break;
			case 2:
				System.out.println("���ļ�");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("ˢ��");
				break;
			case 5:
				System.out.println("�˳�");
				System.exit(0);
//				break;
				
					
			
			}

		}

	}
}
