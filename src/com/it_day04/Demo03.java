package com.itheima_day04;
/*
 * ��֪����int[] nums = {5,10,15},,Ҫ�󴴽�һ��������
	1.������ĳ��Ⱥ���֪������ͬ
	2.������ÿ��Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
	3.�ڿ���̨�д�ӡ�����������Ԫ��

 */

public class Demo03 {
	public static void main(String[] args) {
		// ��֪����
		int[] nums = { 5, 10, 15 };

		
		// ����һ��������
		int[] num = new int[3];

		// ѭ��������nums�����е�ÿ��Ԫ�ض���2
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
			// ��numsֵ��ֵ��num
			num = nums;
		}
		// ������������������Ԫ��
		for (int i = 0; i < num.length; i++) {
			System.out.println("�������Ԫ��Ϊ��" + num[i]);
		}
		
		
	}
}
