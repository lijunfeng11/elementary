package com.itheima.day12;

import java.util.Collection;
/*
 * V put(K key,V value):���Ԫ��
 * V remove(Object key):���ݼ�ɾ����ֵ��Ԫ��
 * void clear():�Ƴ����еļ�ֵ��Ԫ��
 * boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 * boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
 * boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * int size()�����ؼ����еļ�ֵ�ԵĶ���
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("it001", "���");
		map.put("it002", "Java");

		// System.out.println(map);

		// ���ݼ�ɾ����ֵ��
		// map.remove("it001");

		// ��ȡ��ֵ
		// System.out.println(map.get("it001"));

		// void clear():�Ƴ����еļ�ֵ��Ԫ��
		// map.clear();

		// int size()�����ؼ����еļ�ֵ�ԵĶ���
		// map.size();

		// �Ƿ����ָ����key
		// System.out.println(map.containsKey("it001"));

		// boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		// System.out.println(map.containsValue("Java"));

		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
		// System.out.println(map.isEmpty());
		
		Set<String> set = map.keySet();
		System.out.println(set);
		
		
		Collection<String> values = map.values();
		System.out.println(values);
		
	}
}
