package com.itheima.day12_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 
 */
public class Test {
	public static void main(String[] args) {
		// ����ArrayList<HashMap<String, String>>����
		ArrayList<HashMap<String, String>> hm1 = new ArrayList<>();

		// ����Ԫ�ض���
		HashMap<String, String> map = new HashMap<>();
		map.put("��ɮ", "Ů����");
		map.put("����", "����");
		map.put("ղķ˹", "����");
		
		HashMap<String, String> map1= new HashMap<>();
		map1.put("��ɮ1", "Ů����1");
		map1.put("����1", "����1");
		map1.put("ղķ˹1", "����1");
		
		// ���Ԫ��
		
		hm1.add(map);
		hm1.add(map1);
		// ����
		for (HashMap<String, String> hashMap : hm1) {
			Set<String> set = hashMap.keySet();
			for (String key : set) {
				String value = hashMap.get(key);
				System.out.println(key+"---"+value);
			}
			System.out.println();
		}
		
		for (HashMap<String, String> hashMap : hm1) {
			Set<Entry<String,String>> set = hashMap.entrySet();
			for (Entry<String, String> key : set) {
				String key2 = key.getKey();
				String value = key.getValue();
				System.out.println(key2+"----"+value);
			}
			System.out.println();
		}
	}
}
