package com.kaoshi_2;

/*

		String str = "用户ID:987654321 ; 用户名:李四 ; 用户IP:192.168.1.1";
		Map<String, String> map = new HashMap<String, String>();
		for (String s : str.trim().split(";")) {
			String[] ss = s.trim().split(":");
			map.put(ss[0].trim(), ss[1].trim());
		}

		for (Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) throws IOException {
		// 创建字符缓冲输入流对象
		FileReader fis = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fis);
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 读数据
		/*
		 * int by; while((by=fis.read())!=-1) { //遍历出来每一个值 System.out.print(by); }
		 */

		String line;
		// 读取a.txt文件中的数据
		w: while ((line = br.readLine()) != null) {
			// 输出所有元素
			// System.out.println(line);
			// 创建map集合
			Map<String, Integer> map = new HashMap<>();

			for (String s : line.split(" ")) {
				// 用逗号进行切割
				String[] split = s.split(",");

				map.put(split[0], Integer.parseInt(split[1]));// **
			}

			/*
			 * Set<Entry<String, Integer>> set = map.entrySet();
			 * 
			 * for (Entry<String, Integer> entry : set) { String key = entry.getKey();
			 * Integer value = entry.getValue();
			 * 
			 * System.out.println(key + "---" + value);
			 * 
			 * System.out.println("请输入您要检查的球类"); String num = sc.nextLine();
			 * 
			 * if (num.equals(key)) { value += 10; System.out.println("存在：" + value); } else
			 * { System.out.println("您输入的球类名称不存在"); break w; } }
			 */

			for (int i = 0; i < map.size(); i++) {
				
				Set<String> set = map.keySet();
				for (String key : set) {
					Integer value = map.get(key);
					
					 System.out.println(key + "--" + value);

					System.out.println("请输入您要检查的球类");
					String num = sc.nextLine();

					if (num.equals(key)) {
						value += 10;
						System.out.println("存在：" + value);
					} else {
						System.out.println("您输入的球类名称不存在");
						break w;
					}
				}

				// 关闭流
				fis.close();
			}

		}
	}
}
