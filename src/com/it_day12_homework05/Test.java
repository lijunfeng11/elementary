package com.ithiema_day12_homework05;


import java.util.ArrayList;
import java.util.HashSet;

/*
	1.	����һ������Ϊ10��int����,������10��int���͵�����,������һЩ�������ظ���
	2.	���ü��ϵ�֪ʶ���������ȥ��,����������,���ܸı�������ԭ�����ֵĴ�С˳��
	3.	��ӡ�������е����ݰ����������������Ķ���

 */
public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 4, 5, 6, 7, 8, 9, 9 };
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int in : arr) {
			if(list.contains(in)) {
				list.add(in);
			}
		}
		int[] newArr = new int[list.size()];
		// �����¼��ϵ�����
		int index = 0;
		// �������ϣ�Ϊ������Ԫ�ظ�ֵ
		for (int in : list) {
			newArr[index++] = in;
		}
		System.out.println(list);
		
	}
}
