package com.ithiema_day13_homework02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	����˵���������ı��ļ�
 */
public class Test {
	public static void main(String[] args) throws IOException {
		// ��������������
		FileInputStream fis = new FileInputStream("a.txt");

		// �������������
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		//���ļ�����
		//ͨ���ֽ�
		/*int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}*/
		
		//���ֽ�����
		byte[] bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		
		//����
		fis.close();
		fos.close();
	}
}
