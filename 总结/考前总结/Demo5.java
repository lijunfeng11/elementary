package com.itheima_�ܽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
	һ��	�����������󣬲��ô���ʵ�֣� 
	ʵ��һ����֤��С����Ҫ�����£�
		1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
		2. ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��

 */
public class Demo5 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

		for (int i = 1; i <= 3; i++) {
			System.out.println("�������" + i + "����֤��:");
			String s = sc.nextLine();
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		bw.close();

		System.out.println("¼��һ����Ҫ��У�����֤��:");
		String ss = sc.nextLine();

		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		// false : ss���ļ��в�����
		boolean flag = false;

		String line;
		while ((line = br.readLine()) != null) {

			if (ss.equals(line)) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("��֤�ɹ�!");
		} else {
			System.out.println("��֤ʧ��!");
		}

		br.close();
	}

}
