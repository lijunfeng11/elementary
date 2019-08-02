package com.kaoshi_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// 创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 读数据
		/*
		 * int by; while((by=fis.read())!=-1) { //遍历出来每一个值 System.out.print(by); }
		 */
		Map<String, Integer> map = new HashMap<>();
		String line;
		// 读取a.txt文件中的数据
		w: while ((line = br.readLine()) != null) {
			// 输出所有元素
			System.out.println(line);

			for (String s : line.split(" ")) {
				// 用逗号进行切割
				String[] split = s.split(",");

				map.put(split[0], Integer.valueOf(split[1]));// **
			}

			Set<Entry<String, Integer>> set = map.entrySet();

			// System.out.println(key + "---" + value);

			System.out.println("请输入您要检查的球类");
			String num = sc.nextLine();

			String[] split = num.split(",");
			if (map.containsKey(num)) {
				BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
				for (Map.Entry<String, Integer> me : set) {
					if (me.getKey().equals(split[0])) {
						Integer value = me.getValue();
						value += 10;
						me.setValue(value);
						System.out.println("存在：" + value);
					}
					bw.write(me.getKey() + "," + me.getValue());

				}
			} else {
				System.out.println("您输入的球类名称不存在");
				break w;

			}
		}

		// 关闭流

		br.close();

	}

}
