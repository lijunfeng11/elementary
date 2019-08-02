package com.itheima.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("it001", "hello");
		map.put("it002", "Java");
		
		//遍历键找值
		Set<String> set = map.keySet();
		//获取所有键的集合
		for (String key : set) {
			//根据键去找值
			String value = map.get(key);
			System.out.println(key+"----"+value);
			
		}
		
		System.out.println("------------------------");
		
		//获取所有键值对对象的集合
		Set<Entry<String,String>> set2 = map.entrySet();
		//遍历键值对对象的集合，得到每一个键值对对象
		for (Entry<String, String> me : set2) {
			//根据键值对对象获取键和值
			String key2 = me.getKey();
			String value = me.getValue();
			System.out.println(key2+"----"+value);
			
		}
		
	}
}
