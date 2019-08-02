package com.itheima.day12;

import java.util.Collection;
/*
 * V put(K key,V value):添加元素
 * V remove(Object key):根据键删除键值对元素
 * void clear():移除所有的键值对元素
 * boolean containsKey(Object key)：判断集合是否包含指定的键
 * boolean containsValue(Object value):判断集合是否包含指定的值
 * boolean isEmpty()：判断集合是否为空
 * int size()：返回集合中的键值对的对数
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("it001", "李军");
		map.put("it002", "Java");

		// System.out.println(map);

		// 根据键删除键值对
		// map.remove("it001");

		// 获取键值
		// System.out.println(map.get("it001"));

		// void clear():移除所有的键值对元素
		// map.clear();

		// int size()：返回集合中的键值对的对数
		// map.size();

		// 是否包含指定的key
		// System.out.println(map.containsKey("it001"));

		// boolean containsValue(Object value):判断集合是否包含指定的值
		// System.out.println(map.containsValue("Java"));

		// boolean isEmpty()：判断集合是否为空
		// System.out.println(map.isEmpty());
		
		Set<String> set = map.keySet();
		System.out.println(set);
		
		
		Collection<String> values = map.values();
		System.out.println(values);
		
	}
}
