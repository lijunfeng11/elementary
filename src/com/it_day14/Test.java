package com.ithiema_day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		// �����ַ�����������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));

		osw.write("��ã�12313");
		// �����ַ����������
		osw.close();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));

		/*int ch;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);
		}*/
		char[] ch=new char[1024];
		int len;
		while((len=isr.read(ch))!=-1) {
			System.out.println(new String(ch,0,len));
		}
		
		isr.close();
		osw.close();
	}
}
