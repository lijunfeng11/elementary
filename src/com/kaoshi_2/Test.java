package com.kaoshi_2;

/*

		String str = "�û�ID:987654321 ; �û���:���� ; �û�IP:192.168.1.1";
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
		// �����ַ���������������
		FileReader fis = new FileReader("a.txt");
		BufferedReader br = new BufferedReader(fis);
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		// ������
		/*
		 * int by; while((by=fis.read())!=-1) { //��������ÿһ��ֵ System.out.print(by); }
		 */

		String line;
		// ��ȡa.txt�ļ��е�����
		w: while ((line = br.readLine()) != null) {
			// �������Ԫ��
			// System.out.println(line);
			// ����map����
			Map<String, Integer> map = new HashMap<>();

			for (String s : line.split(" ")) {
				// �ö��Ž����и�
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
			 * System.out.println("��������Ҫ��������"); String num = sc.nextLine();
			 * 
			 * if (num.equals(key)) { value += 10; System.out.println("���ڣ�" + value); } else
			 * { System.out.println("��������������Ʋ�����"); break w; } }
			 */

			for (int i = 0; i < map.size(); i++) {
				
				Set<String> set = map.keySet();
				for (String key : set) {
					Integer value = map.get(key);
					
					 System.out.println(key + "--" + value);

					System.out.println("��������Ҫ��������");
					String num = sc.nextLine();

					if (num.equals(key)) {
						value += 10;
						System.out.println("���ڣ�" + value);
					} else {
						System.out.println("��������������Ʋ�����");
						break w;
					}
				}

				// �ر���
				fis.close();
			}

		}
	}
}
