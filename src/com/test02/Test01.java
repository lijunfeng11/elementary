package com.test02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 测试类
 */
public class Test01 {
	public static void main(String[] args) throws Exception {
		
		
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		System.out.println("请录入菜名");
		String line1 = sc.nextLine();

		System.out.println("请录入价格");
		String line2 = sc.nextLine();

		System.out.println("请录入菜系");
		String line3 = sc.nextLine();

		// 创建元素对象
		Menu m = new Menu(line1, Integer.parseInt(line2), line3);
		// 创建集合对象
		ArrayList<Menu> list = new ArrayList<>();
		list.add(m);

		System.out.println(list);

		// 创建高效的字符串输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("Menu.txt"));

		// 将菜单写入文本问价
		String lean;
		for (Menu mu : list) {
			lean = mu.getName() + mu.getJg() + mu.getCx();
			bw.newLine();
			bw.flush();
		}

		// 释放资源
		bw.close();

	}
}
