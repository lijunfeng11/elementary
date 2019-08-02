package com.ithiema_day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test04 {
	public static void main(String[] args) throws IOException {

		ArrayList<String> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader("d.txt"));
		//读取每一行元素将数据添加到集合中
		String line;
		while((line=br.readLine())!=null) {
			list.add(line);
		}
		//关流
		br.close();
		
		//遍历集合
		for (String s : list) {
			System.out.println(s);
		}
	}
}
