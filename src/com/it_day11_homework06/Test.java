package com.ithiema_day11_homework06;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		String[] str = { "def", "efg", "def", "def", "qwe", "def", "def", "swd", "wwe", "def", "def" };
		// 1. ����ArrayList����
		ArrayList<String> list = new ArrayList<>();

		for (String s : str) {
			list.add(s);
		}
		// System.out.println(list);

		/*
		 * // forѭ������ for (int i = 0; i < list.size(); i++) { String string =
		 * list.get(i); char charAt = string.charAt(3); System.out.println(string);
		 * System.out.println("����Ϊ3��Ԫ��Ϊ��" + charAt); }
		 */
		boolean myContains = myContains(list, "def");
		if(myContains) {
			System.out.println("�ڼ����г��ֹ�");
		}else {
			System.out.println("�ڼ�����û�г��ֹ�");
		}
		deleteStr(list, "def");
		smalToBig(list);
		
	}

	// 3. ���巽��public static boolean myContains(ArrayList list,String str)
	public static boolean myContains(ArrayList<String> list, String str) {
		int count = 0;
		for (int i = 0; i <list.size(); i++) {
			String s = list.get(i);
			if(s.equals(str)) {
				count++;
			}
		}

		System.out.println(str+"���ֵ�"+count+"��");
		if(count==0) {
			return false;
		}else {
			return true;
		}
	}
	//
	public static void deleteStr(ArrayList<String> list, String str) {
		
		for(int i=list.size()-1;i>=0;i--) {
			String s = list.get(i);
			if(s.equals(str)) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
	//
	public static void smalToBig(ArrayList<String> list) {
		
		for (int i = 0; i <list.size(); i++) {
			String s = list.get(i);
			list.set(i, s.toUpperCase());
			
		}
		System.out.println(list);
	}
}
