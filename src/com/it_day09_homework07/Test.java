package com.ithiema_day09_homework07;

import java.util.Scanner;

/*
 * 统计小字符串在大字符串中出现的次数
 * public String replaceAll​(String regex,String replacement)
 * 用给定的替换替换与给定的regular expression匹配的此字符串的每个子字符串
 * 思路1：找到大字符串的长度，将大字符串复制一份变成第二小的	第二小的字符中把小字符
 * 			用空格替换，用大字符串的长度减去第二小的在除以小字符串的长度
 * 
 * 思路2：首先找到第一次出现的位置，然后把前面所有删除，再继续找后面的
 * public boolean contains​(CharSequence s)
 * 当且仅当此字符串包含指定的char值序列时才返回true
 * 
 * public int indexOf​(int ch)
 * 返回指定字符第一次出现的字符串内的索引
 * 
 * public String substring​(int beginIndex)返回一个字符串，
 * 该字符串是此字符串的子字符串。子字符串以指定索引处的字符开头，
 * 并扩展到此字符串的末尾
 * 
 */
public class Test{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请录入大字符串");
		String bigStr = sc.nextLine();
		String bigStr1=bigStr;
		
		System.out.println("请录入小字符串");
		String smallStr = sc.nextLine();
		
		/*int count=0;
		while (true) {
			if(bigStr.contains(smallStr)) {
				int index = bigStr.indexOf(smallStr);
				bigStr = bigStr.substring(index+smallStr.length());
				count++;
			}else {
				break;
			}
			
		}
		System.out.println(bigStr1+"出现了"+count+"次");*/
		
		System.out.println((bigStr.length()-bigStr.replaceAll(smallStr, "").length())/smallStr.length());
		
	}
	
}
