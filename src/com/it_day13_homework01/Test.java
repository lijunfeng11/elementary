package com.ithiema_day13_homework01;

/*
	һ��	����˵������д���룬����ArithmeticException�쳣����ʹ��try..catch���д���
	����	����ʽ�����쳣��Ϣ����ڿ���̨

 */
public class Test {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
