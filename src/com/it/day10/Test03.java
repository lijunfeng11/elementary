package com.itheima.day10;

public class Test03 {
	public static void main(String[] args) {
		// String -- intInteger :
		// public static int parseInt(String s) Integer里面的方法
		// 注意事项: s必须是数字字符
		String a = "100";
		int parseInt = Integer.parseInt(a);
		System.out.println(parseInt);

		// int --String
		// public static String valueOf(int i) String类里面的方法
		// 最常用 : 基本数据类型+ ""
		String aa = 100 + "";
		Integer valueOf = Integer.valueOf(aa);
		System.out.println(valueOf);
		System.out.println(aa);

	}
}
