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

		// 添加元素
		hm.put("1", list1);
		hm.put("2", list2);

		// 遍历
		//键找值
		
		//遍历键找值
		Set<String> keySet = hm.keySet();
		//获取所有键的集合
		for (String key : keySet) {
			//根据键去找值
			ArrayList<String> value = hm.get(key);
			for (String string : value) {
				System.out.println(key+"---"+string);
			}
			System.out.println();
		}
		
		//键值对对象
		Set<Entry<String,ArrayList<String>>> entrySet = hm.entrySet();
		//遍历键值对对象的集合，得到每一个键值对对象
		for (Entry<String, ArrayList<String>> set : entrySet) {
			//根据键值对对象获取键和值
			String key = set.getKey();
			ArrayList<String> value = set.getValue();
			for (String str : value) {
				System.out.println( key+"---"+str);
			}
			System.out.println();
		}
	}
}
