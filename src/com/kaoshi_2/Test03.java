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
			System.out.println("������");
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
		// ������������������
		BufferedReader buf = new BufferedReader(new FileReader("a.txt"));

		// ����map���϶���
		Map<String, Integer> map = new HashMap<>();
		// ������ֵ�Զ���
		Set<Map.Entry<String, Integer>> set = map.entrySet();

		// �����ݶ�������̨
		String line = buf.readLine();
		while (line != null) {
			// ��ȡ����֮ǰ����Ϊ��ֵ����ŵ�������
			String[] split = line.split(",");
			System.out.println(line);
			// ��ӵ�map������
			map.put(split[0], Integer.valueOf(split[1]));
			line = buf.readLine();
		}

		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�������ࣺ");
		// ����
		String s = sc.nextLine();
		//�ö��Ž����и�
		String[] split = s.split(",");

		//�ж�������Ƿ���������
		if (map.containsKey(s)) {
			// �������ַ���������
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
			System.out.println("������");
		}
	}
}