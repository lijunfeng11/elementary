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
		// 创建ArrayList<HashMap<String, String>>对象
		ArrayList<HashMap<String, String>> hm1 = new ArrayList<>();

		// 创建元素对象
		HashMap<String, String> map = new HashMap<>();
		map.put("唐僧", "女儿国");
		map.put("库里", "美国");
		map.put("詹姆斯", "美国");
		
		HashMap<String, String> map1= new HashMap<>();
		map1.put("唐僧1", "女儿国1");
		map1.put("库里1", "美国1");
		map1.put("詹姆斯1", "美国1");
		
		// 添加元素
		
		hm1.add(map);
		hm1.add(map1);
		// 遍历
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
