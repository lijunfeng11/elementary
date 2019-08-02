package com.itheima_总结;

import javax.print.attribute.standard.Media;

/*
 * 
 * 方法 : 完成某个特定功能的代码块
 * 好处 : 提高代码的复用性
 * 
 * 有具体返回值的方法 : 
 * 		修饰符 返回值类型 方法名(数据类型  变量名1 , 数据类型  变量名2 ...){
 * 			方法体; 
 * 			return 返回值;
 * 		}
 * 
 * 		调用 : 1 单独调用 	2  赋值调用		3 输出调用
 * 
 * 
 * 无具体返回值的方法(void修饰的方法)
 * 
 * 		修饰符 void 方法名(数据类型  变量名1 , 数据类型  变量名2 ...){
 * 			方法体; 
 * 		}
 * 
 * 		调用 : 单独调用 
 * 
 * 方法重载 : 	在一个类中,出现了方法名相同的方法
 * 特点 : 1 方法名相同    2 参数列表不同(a: 参数的个数不同   b: 对应的数据类型不同)
 * 注意事项 : 方法重载与返回值类型无关 ***
 * 
 * 
 * 方法传参 : 
 * 	方法的参数是基本数据类型 : 形参的改变不影响实参的值	 	传递的值数据值
 * 	方法的参数是引用数据类型 : 形参的改变直接影响实参的值  	 	传递的是地址值
 * 
 */
public class Dat05 {
	
	public static void main(String[] args) {
		int a = 10;
		method(a);
		
	}

	public static int method(int[] arr){
		return 1;
	}
	
	public static void method(double a){
		
	}

}
