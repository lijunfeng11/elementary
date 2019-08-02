package com.itheima;

public class DiGui {

	public static void main(String[] args) {
		/*
		 * byte b =10; b+=20;//隐含了一个转换b=(byte)b+(int)20 提升为int
		 * System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		 */
		
		double fengzi, sum1 = 0;
		int count = 0;
		for (fengzi = 1;; fengzi += 2) {
			if (count % 2 == 0) {
				sum1 = sum1 - 4 / fengzi;
			}else {
				sum1 = sum1 + 4 / fengzi;
			}
			
			if (sum1 >= 3.1415926 && sum1 <= 3.1415927) {
				System.out.println("经历了" + count + "次运算，结果为" + sum1);
				break;
			}
		}

		
		
		
		int sum = getSum(5);
		System.out.println(sum);

		/*int a = 1234;
		int ge = a % 10;
		int shi = a % 100 / 10;
		int bai = a / 100 % 10;
		int qian = a / 1000 % 10;
		System.out.println(ge + " " + shi + " " + bai+" "+qian);*/
		final int a;
		a=10;
//		a1=20;
		
		
	}

	// 递归
	public static int getSum(int n) {// 5

		if (n == 1) {
			return 1;

		}
		int temp = getSum(n - 1);
		return temp + n;// 9
	}
	
	

}
