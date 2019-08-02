package com.ithiema_day13_homework01;

/*
	一、	需求说明：编写代码，产生ArithmeticException异常，并使用try..catch进行处理。
	二、	处理方式：将异常信息输出在控制台

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
