package com.itheima.day10;

public class Test03 {
	public static void main(String[] args) {
		// String -- intInteger :
		// public static int parseInt(String s) Integer����ķ���
		// ע������: s�����������ַ�
		String a = "100";
		int parseInt = Integer.parseInt(a);
		System.out.println(parseInt);

		// int --String
		// public static String valueOf(int i) String������ķ���
		// ��� : ������������+ ""
		String aa = 100 + "";
		Integer valueOf = Integer.valueOf(aa);
		System.out.println(valueOf);
		System.out.println(aa);

	}
}
