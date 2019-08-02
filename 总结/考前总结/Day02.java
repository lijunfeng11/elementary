package com.itheima_总结;
/*
 *   运算符 : (就是连接常量或者变量的一种符号)
 *   	1 算数运算符 : + -  *  /  %
 *   		注意事项 : 两个整数相除得到的是整数,想得到小数 必须有浮点数(小数)参与运算	6/4=1	6/4.0=1.5
 *   		/和%的区别:  /得到的是两个数的商    %得到的是两个的余数
 *   		
 *   	2 自增自减运算符
 *   		单独使用的时候比较多,++ -- 不管是在前或后,对结果没有影响的
 *   		参与其他操作的时候
 *   			++ -- 在变量的前面的时候先对其自身进行+1或者是-1 然后在参与运算
 *   			++ -- 在变量的后面的时候先参与运算,然后在自身进行+1或者是-1;
 *   	3 赋值运算符
 *   		基本的 : = 		int a = 10;
 *   		扩展的 : +=  -=  *=  /=  %=		将运算符左边的变量和右边的值做运算,在把结果赋值给左边的变量
 *   		int a = 10;
 *   		a *= 20;// a = a * 20
 *   
 *   		byte b = 10;
 *   		b += 10; // b = (byte)(b + 10);
 *   		注意事项:有强制类型转换的作用
 *   		
 *   	4 关系运算符 : ==  !=  >  >=  <  <=
 *   	注意 : 用关系运算符连接起来的式子叫做关系表达式,结果是一个boolean类型的值
 *   		
 *   	5 逻辑运算符
 *   		&&:特点 :有false则false , 具有短路作用,当左边为false时候右边不执行		1 > 2 && 2 < 3
 *   		& :特点 :有false则false 
 *   		||:特点 : 有true则true , 具备短路做用,当左边为true的时候,右边不执行
 *   		| :特点 : 有true则true
 *   		! :特点 :非false则true,非true则false 
 *   		^ :特点:相同为false,不同为true,举例男女关系		true ^ false
 *   		
 *   	6 三元运算符
 *   		格式:  关系表达式 ? 表达式1  :  表达式2 ;
 *   		执行流程:
			首先计算关系表达式的值是true还是false
			如果是true就执行值1;
			如果为false就执行值2;
 *   	
 *   
 *   流程语句 : 
 *   		顺序结构语句 : 代码从上往下依次执行
 *   		选择结构语句 : 
 *   			if语句
 *   				 if(关系表达式){
						   语句体;
					 }
					 
					  if(关系表达式){
						语句体1;
					  }else {
					 	语句体2;
					  }
					  
					   if(关系表达式1){
					 	  语句体1;
					   }else if(关系表达式2){
					 	  语句体2;
					   }else if(关系表达式3){
					 	 语句体3;
					   }...else{
					 	语句体n;
					   }
					   
					   
   				switch语句 
  
   			  	switch(表达式){//表达式的值可以是 byte  char  short  int  jdk5:枚举   jdk7:字符串
				  	case 值1:
				 		语句体1;
				  		break;//中断
				  	case 值2:
				 		语句体2;
				 		break;
				  	.......
				 	default://相当于if语句中 else
				 		语句体n+1;
				 		break;
				  }
				  
				  
   			循环结构语句
   			
   				for循环
   					for(初始化语句;判断条件语句;控制条件语句){
							循环体语句;
					}

   				while循环
   					初始化语句;
					while(判断条件语句){
						循环体语句;
						控制条件语句;
					}
   					
   				do...while循环 : 至少执行一次循环体
   					 初始化语句;
					 do{
						循环体语句;
						控制条件语句;
					 }while(判断条件语句);
   
   			for,while和do...while循环的区别 : for,while先判断在执行循环 , do...while先执行循环体,在做判断
   		
  			
 */
public class Day02 {
	public static void main(String[] args) {
		int a = 10;
		++a;
		System.out.println(a);
		
		System.out.println("----------");
		int b = 10;
		int c = b++;
		System.out.println(b);//11
		System.out.println(c);//10
		System.out.println("----------");
		
		int x = 10;// 12
		int y = x++ + ++x + x;
		// 10 + 12 + 12
		System.out.println(x);// 12
		System.out.println(y);// 34
		
		
	}

}
