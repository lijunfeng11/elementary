package com.itheima.day12_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> hm = new HashMap<>();

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("it001");
		list1.add("it002");
		list1.add("it003");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("it004");
		list2.add("it005");
		list2.add("it006");

		// ���Ԫ��
		hm.put("1", list1);
		hm.put("2", list2);

		// ����
		//����ֵ
		
		//��������ֵ
		Set<String> keySet = hm.keySet();
		//��ȡ���м��ļ���
		for (String key : keySet) {
			//���ݼ�ȥ��ֵ
			ArrayList<String> value = hm.get(key);
			for (String string : value) {
				System.out.println(key+"---"+string);
			}
			System.out.println();
		}
		
		//��ֵ�Զ���
		Set<Entry<String,ArrayList<String>>> entrySet = hm.entrySet();
		//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for (Entry<String, ArrayList<String>> set : entrySet) {
			//���ݼ�ֵ�Զ����ȡ����ֵ
			String key = set.getKey();
			ArrayList<String> value = set.getValue();
			for (String str : value) {
				System.out.println( key+"---"+str);
			}
			System.out.println();
		}
	}
}
