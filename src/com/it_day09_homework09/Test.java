package com.ithiema_day09_homework09;

import java.util.Arrays;
import java.util.Scanner;

/*
	1.����¼��һ���ַ���
	2.�����ַ�������ַ�����(����ʹ��toCharArray()����)
	3.���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
	4.�����һλ�����һλ�����ݲ���ͬ,�򽻻�
	5.���ַ�����������Ϊż����Ԫ�ر��'~'
	6.��ӡ����Ԫ�ص�����

 */
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��¼��һ���ַ���");
		
		String s = sc.nextLine();
		char[] chs = new char[s.length()];
		// System.out.println(s.toCharArray());
		
		
		for (int i = 0; i <s.length(); i++) {
			char charAt = s.charAt(i);
			chs[i]=charAt;
		}
		System.out.println(Arrays.toString(chs));
		
	}
}
