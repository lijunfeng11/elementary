package com.itheima_�ܽ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 		���������
 			1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123
		  	2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
			jack,123
			rose,123
			tom,123
		  3.Ҫ��������¹��ܣ�
	 		��������ʱ������̨��ʾ�û�����ע����û��������룻
	   		��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
	   			�ǣ�����̨��ʾ���û����Ѵ���
	   			�񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��
	  
 */
public class Demo6 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("¼��ע����:");
		String name = sc.nextLine();

		System.out.println("¼��ע������");
		String pwd = sc.nextLine();

		BufferedReader br = new BufferedReader(new FileReader("user.txt"));

		boolean flag = false; // false ע�������ļ��в����� , true ע�������ļ��д���

		String line;// "jack,123"
		while ((line = br.readLine()) != null) {
			String[] strs = line.split(",");// {"jack" , "123"}

			if (strs[0].equals(name)) {
				flag = true;
			}
		}
		br.close();

		if (flag) {
			System.out.println("�û����Ѵ���!");
		} else {
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt", true));
			
			bw.write(name + "," + pwd);
			bw.newLine();
			bw.close();
			System.out.println("ע��ɹ�!");
		}
		
		

	}

}
