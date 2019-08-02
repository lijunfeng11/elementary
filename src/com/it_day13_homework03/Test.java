package com.ithiema_day13_homework03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Iterator;

/*
需求: 读取当前项目下的info1.txt
			文件内容如下 : aaaaaaaaaaabbbbbbbbbbbbccdefg
		  要求将数据去重后写回
	 		最终效果 : fgdebca

 */
public class Test {
	public static void main(String[] args) throws Exception {
		// 创建输入流对象
		FileInputStream fis = new FileInputStream("info1.txt");

		// 创建集合对象
		HashSet<Character> hs = new HashSet<>();

		// 通过字节获取
		int len;
		while ((len = fis.read()) != -1) {
			hs.add((char) len);
		}
		// 创建输出流对象
		FileOutputStream fos = new FileOutputStream("info1.txt");

		// 遍历集合
		Iterator<Character> it = hs.iterator();
		while (it.hasNext()) {
			Character next = it.next();
			fos.write(next);
		}

		// 关流
		fis.close();
		fos.close();

	}
}
