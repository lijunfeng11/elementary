package com.itheima.d730;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
 * �ַ�������ϰ֮�Ѽ����е��ַ������ݴ洢���ı��ļ�
 * ���� : 
 * 		1 �������϶���ArrayList
 * 		2 �����������Ԫ��
 * 		3 ������Ч���ַ������
 * 		4 ��������,�õ������е�ÿһ������,ʹ��������������ļ���д��
 * 		5 ����
 */
import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<>();

		// �����������Ԫ��
		list.add("��ɼ");
		list.add("����");
		list.add("cls");
		list.add("xzls");
		// ������Ч���ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		// ��������,�õ������е�ÿһ������,ʹ��������������ļ���д��
		for (String s : list) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
