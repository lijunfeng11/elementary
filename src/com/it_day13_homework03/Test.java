package com.ithiema_day13_homework03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Iterator;

/*
����: ��ȡ��ǰ��Ŀ�µ�info1.txt
			�ļ��������� : aaaaaaaaaaabbbbbbbbbbbbccdefg
		  Ҫ������ȥ�غ�д��
	 		����Ч�� : fgdebca

 */
public class Test {
	public static void main(String[] args) throws Exception {
		// ��������������
		FileInputStream fis = new FileInputStream("info1.txt");

		// �������϶���
		HashSet<Character> hs = new HashSet<>();

		// ͨ���ֽڻ�ȡ
		int len;
		while ((len = fis.read()) != -1) {
			hs.add((char) len);
		}
		// �������������
		FileOutputStream fos = new FileOutputStream("info1.txt");

		// ��������
		Iterator<Character> it = hs.iterator();
		while (it.hasNext()) {
			Character next = it.next();
			fos.write(next);
		}

		// ����
		fis.close();
		fos.close();

	}
}
