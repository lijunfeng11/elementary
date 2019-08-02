package com.ithiema_day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws Exception {
		// �����ַ���һ�ζ�ȡһ���ַ���
		// method1();
		// �����ַ���һ�ζ�дһ���ַ�����
		// method2();
		// �����ַ���һ�ζ�дһ���ַ�
		// method3();

		// һ�ζ�дһ���ַ�
		// һ�ζ�дһ���ַ�����
		// method4();

	}

	private static void method4() throws IOException {
		// �����ַ�������
		BufferedReader br = new BufferedReader(new FileReader("Father.java"));
		// �����ַ�������
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.java"));

		// һ�ζ�дһ���ַ�

		// int ch;
		// while((ch=br.read())!=-1) {
		// bw.write(ch);
		// }

		// һ�ζ�дһ���ַ�����
		char[] ch = new char[1024];
		int len;
		while ((len = br.read(ch)) != -1) {
			bw.write(ch, 0, len);

		}

		// �ͷ���Դ
		br.close();
		bw.close();

	}

	private static void method1() throws Exception {
		// ����һ������������
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// ����һ�����������
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// �����ַ���һ�ζ�ȡһ���ַ���
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// ����
		br.close();
		bw.close();

	}

	private static void method2() throws Exception {

		// ����һ����������������
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));

		// ����һ���������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

		// �����ַ���һ�ζ�дһ���ַ�����
		char[] ch = new char[1024];
		int len;
		while ((len = br.read(ch)) != -1) {
			bw.write(ch, 0, len);
		}

		// ����
		br.close();
		bw.close();
	}

	private static void method3() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

		// �����ַ���һ�ζ�дһ���ַ�
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}
		br.close();
		bw.close();

	}

}
