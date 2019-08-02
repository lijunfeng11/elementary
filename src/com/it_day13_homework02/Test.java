package com.ithiema_day13_homework02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	需求说明：拷问文本文件
 */
public class Test {
	public static void main(String[] args) throws IOException {
		// 创建输入流对象
		FileInputStream fis = new FileInputStream("a.txt");

		// 创建输出流对象
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		//将文件拷贝
		//通过字节
		/*int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}*/
		
		//用字节数组
		byte[] bys=new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		
		//关流
		fis.close();
		fos.close();
	}
}
