package com.itheima_�ܽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
	һ��	�����������󣬲��ô���ʵ��
	���� : ��Ŀ��·������text.txt�ļ�����������
	�Ұ�����
	123456
	
	����IO����֪ʶ��ȡtext.txt�ļ������ݷ�ת��д��text.txt�ļ���
	654321
	��ڰ���

 */
public class Demo7 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader("text.txt"));

		String line;// "123456"
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();

		// System.out.println(list);// {"�Ұ�����" ,"123456"}

		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));

		for (int i = list.size() - 1; i >= 0; i--) {
			String s = list.get(i);// "�Ұ�����"

			StringBuilder sb = new StringBuilder(s);// ��ڰ���
			sb.reverse();

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.close();
	}

}
