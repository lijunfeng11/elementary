package com.itheima.day13;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {

		/*
		 * FileOutputStream fos = new FileOutputStream("/b.txt");
		 * fos.write("ABCD".getBytes(),0,3);
		 * 
		 * fos.close();
		 */

		File file = new File("a.txt");

		// boolean createNewFile() : 当指定文件不存在时创建文件并返回true，否则返回false
		// System.out.println(file.createNewFile());

		// boolean mkdir() : 当指定文件夹不存在时创建文件夹并返回true，否则返回false
		// System.out.println(file.mkdir());

		// boolean mkdirs() : 创建指定文件夹，当文件夹所在的目录不存在，则顺道一块创建了
		// System.out.println(file.mkdirs());

		// boolean delete() :当指定的文件或文件夹存在时删除文件或者文件夹 并返回true，否则返回false
		// 注意:注意 : 删除一个文件夹，这个文件夹下面不能有其他的文件和文件夹,而且不走回收站
		// System.out.println(file.delete());

		// String getAbsolutePath() : 以String形式返回File对象所指向的绝对路径
		// File file = new File("a.txt");
		// System.out.println(file.getAbsolutePath());
		// D:\workspace\homework\a.txt

		// String getName() : 获取路径的最后一级名字,返回路径的字符串形式(文件文件夹都可以获取)
		// System.out.println(file.getName());

		// long length() : 返回文件的字节数
		// System.out.println(file.length());

		// String getPath() : 返回创建File对象时给的路径
		// System.out.println(file.getPath());

		// boolean exists() : 判断文件或者文件夹是否存在，如果存在则返回true，否则返回false
		// System.out.println(file.exists());

		// boolean isDirectory() ：判断File对象指向的路径是否是文件夹，如果是则返回true，否则返回false
		// System.out.println(file.isDirectory());

		// boolean isFile() : 判断File对象指向的路径是否是文件，如果是则返回true，否则返回false
		// System.out.println(file.isFile());
		String s = "abcd";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
}
