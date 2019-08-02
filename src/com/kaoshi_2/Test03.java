package com.kaoshi_2;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) throws IOException {

		BufferedReader buf = new BufferedReader(new FileReader("a.txt"));

		Map<String, Integer> map = new HashMap<>();

		Set<Entry<String, Integer>> set = map.entrySet();
		
		String line = buf.readLine();
		while (line != null) {
			String[] split = line.split(",");
			System.out.println(line);
			map.put(split[0], Integer.valueOf(split[1]));
			String readLine = buf.readLine();
		}
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] split = s.split(",");

		if (map.containsKey(s)) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
			
			for (Map.Entry<String, Integer> me : set) {
				if (me.getKey().equals(split[0])) {
					Integer value = me.getValue();
					value += 10;
					me.setValue(value);
				}
				bw.write(me.getKey() + "," + me.getValue());
				bw.newLine();
				bw.flush();
				// System.out.println(me.getKey() + " " + me.getValue());
			}
		} else {
			System.out.println("不存在");
		}
	}
}*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 创建缓冲输入流对象
		BufferedReader buf = new BufferedReader(new FileReader("a.txt"));

		// 创建map集合对象
		Map<String, Integer> map = new HashMap<>();
		// 创建键值对对象
		Set<Map.Entry<String, Integer>> set = map.entrySet();

		// 将数据读到控制台
		String line = buf.readLine();
		while (line != null) {
			// 截取逗号之前的作为键值，存放到数组中
			String[] split = line.split(",");
			System.out.println(line);
			// 添加到map集合中
			map.put(split[0], Integer.valueOf(split[1]));
			line = buf.readLine();
		}

		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要检查的球类：");
		// 接收
		String s = sc.nextLine();
		//用逗号进行切割
		String[] split = s.split(",");

		//判断输入的是否包含这个键
		if (map.containsKey(s)) {
			// 创建输字符出流对象
			BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
			for (Map.Entry<String, Integer> me : set) {

				if (me.getKey().equals(split[0])) {
					Integer value = me.getValue();
					value += 10;
					me.setValue(value);
				}
				bw.write(me.getKey() + "," + me.getValue());
				// bw.newLine();
				// bw.flush();
				// System.out.println(me.getKey() + " " + me.getValue());
			}
		} else {
			System.out.println("不存在");
		}
	}
}