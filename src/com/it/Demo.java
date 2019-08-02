package com.itheima;

public class Demo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("索引：" + i + " 值：" + arr[i]);
		}

		System.out.println("-----------");
		
		/*int i = 0;
		while (arr.length > i) {
			System.out.println("索引：" + i + " 值：" + arr[i]);
			i++;
		}*/
		
		
		/*int i=0;
		do{
		 System.out.println("索引："+i+" 值："+arr[i]);
		 i++;
		 }while(i<arr.length);
		*/
		for (int i = 0; i <arr.length; i++) {
			 System.out.println("索引："+i+" 值："+arr[i]);
			 }
	}
}
