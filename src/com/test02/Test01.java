package com.test02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ������
 */
public class Test01 {
	public static void main(String[] args) throws Exception {
		
		
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		System.out.println("��¼�����");
		String line1 = sc.nextLine();

		System.out.println("��¼��۸�");
		String line2 = sc.nextLine();

		System.out.println("��¼���ϵ");
		String line3 = sc.nextLine();

		// ����Ԫ�ض���
		Menu m = new Menu(line1, Integer.parseInt(line2), line3);
		// �������϶���
		ArrayList<Menu> list = new ArrayList<>();
		list.add(m);

		System.out.println(list);

		// ������Ч���ַ��������
		BufferedWriter bw = new BufferedWriter(new FileWriter("Menu.txt"));

		// ���˵�д���ı��ʼ�
		String lean;
		for (Menu mu : list) {
			lean = mu.getName() + mu.getJg() + mu.getCx();
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
		bw.close();

	}
}
