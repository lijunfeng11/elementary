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
		// �����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ������
		/*
		 * int by; while((by=fis.read())!=-1) { //��������ÿһ��ֵ System.out.print(by); }
		 */
		Map<String, Integer> map = new HashMap<>();
		String line;
		// ��ȡa.txt�ļ��е�����
		w: while ((line = br.readLine()) != null) {
			// �������Ԫ��
			System.out.println(line);

			for (String s : line.split(" ")) {
				// �ö��Ž����и�
				String[] split = s.split(",");

				map.put(split[0], Integer.valueOf(split[1]));// **
			}

			Set<Entry<String, Integer>> set = map.entrySet();

			// System.out.println(key + "---" + value);

			System.out.println("��������Ҫ��������");
			String num = sc.nextLine();

			String[] split = num.split(",");
			if (map.containsKey(num)) {
				BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
				for (Map.Entry<String, Integer> me : set) {
					if (me.getKey().equals(split[0])) {
						Integer value = me.getValue();
						value += 10;
						me.setValue(value);
						System.out.println("���ڣ�" + value);
					}
					bw.write(me.getKey() + "," + me.getValue());

				}
			} else {
				System.out.println("��������������Ʋ�����");
				break w;

			}
		}

		// �ر���

		br.close();

	}

}
