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

		// boolean createNewFile() : ��ָ���ļ�������ʱ�����ļ�������true�����򷵻�false
		// System.out.println(file.createNewFile());

		// boolean mkdir() : ��ָ���ļ��в�����ʱ�����ļ��в�����true�����򷵻�false
		// System.out.println(file.mkdir());

		// boolean mkdirs() : ����ָ���ļ��У����ļ������ڵ�Ŀ¼�����ڣ���˳��һ�鴴����
		// System.out.println(file.mkdirs());

		// boolean delete() :��ָ�����ļ����ļ��д���ʱɾ���ļ������ļ��� ������true�����򷵻�false
		// ע��:ע�� : ɾ��һ���ļ��У�����ļ������治�����������ļ����ļ���,���Ҳ��߻���վ
		// System.out.println(file.delete());

		// String getAbsolutePath() : ��String��ʽ����File������ָ��ľ���·��
		// File file = new File("a.txt");
		// System.out.println(file.getAbsolutePath());
		// D:\workspace\homework\a.txt

		// String getName() : ��ȡ·�������һ������,����·�����ַ�����ʽ(�ļ��ļ��ж����Ի�ȡ)
		// System.out.println(file.getName());

		// long length() : �����ļ����ֽ���
		// System.out.println(file.length());

		// String getPath() : ���ش���File����ʱ����·��
		// System.out.println(file.getPath());

		// boolean exists() : �ж��ļ������ļ����Ƿ���ڣ���������򷵻�true�����򷵻�false
		// System.out.println(file.exists());

		// boolean isDirectory() ���ж�File����ָ���·���Ƿ����ļ��У�������򷵻�true�����򷵻�false
		// System.out.println(file.isDirectory());

		// boolean isFile() : �ж�File����ָ���·���Ƿ����ļ���������򷵻�true�����򷵻�false
		// System.out.println(file.isFile());
		String s = "abcd";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
}
