package com.itheima_�ܽ�;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * �ַ�������ϰ֮���ı��ļ��е��ַ������ݶ�ȡ������
 * 
 * 
 * 	���� : 
 * 		1 �������϶���
 * 		2 ������Ч���ַ�����������
 * 		3 ʹ�ø�Ч���ַ�������һ�ζ�һ������, �ٰѶ��������ݴ洢��������
 * 		4 ����
 * 		5 ��������
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		// �������϶���
		ArrayList<String> list = new ArrayList<>();
  
		// ������Ч���ַ�����������
		BufferedReader br = new BufferedReader(new FileReader("Teacher.txt"));
		
		// ʹ�ø�Ч���ַ�������һ�ζ�һ������, �ٰѶ��������ݴ洢��������

		String line;// ��¼����ÿ�ζ�����һ�е�����
		
		while((line = br.readLine()) != null){
			list.add(line);
		}
		
		// ����
		br.close();
		
		// ��������
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}
}
