package com.itheima_�ܽ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �ַ�������ϰ֮�Ѽ����е��ַ������ݴ洢���ı��ļ�
 * 
 * 	���� : 
 * 		1 �������϶���ArrayList
 * 		2 �����������Ԫ��
 * 		3 ������Ч���ַ������
 * 		4 ��������,�õ������е�ÿһ������,ʹ��������������ļ���д��
 * 		5 ����
 * 
 * �ļ��е�����:
 * xxx
 * xxx
 * xx
 * xx
 * ...
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		// �������϶���ArrayList
		ArrayList<String> list = new ArrayList<>();

		// �����������Ԫ��
		list.add("��ɼ");
		list.add("����");
		list.add("cls");
		list.add("xzls");

		// ������Ч���ַ������
		BufferedWriter bw = new BufferedWriter(new FileWriter("Teacher.txt"));

		// ��������,�õ������е�ÿһ������,ʹ��������������ļ���д��
//		for(String s : list){
//			bw.write(s);
//			bw.newLine();
//			bw.flush();
//		}
		
		for(int i = 0 ; i < list.size() ; i++){
			String s = list.get(i);
			bw.write(s);
			
			if(i != list.size() - 1 ){
				bw.newLine();
			}
			
			bw.flush();
		}
		
		bw.close();
	}
}
