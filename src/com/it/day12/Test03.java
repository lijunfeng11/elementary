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
		
		//��������ֵ
		Set<String> set = map.keySet();
		//��ȡ���м��ļ���
		for (String key : set) {
			//���ݼ�ȥ��ֵ
			String value = map.get(key);
			System.out.println(key+"----"+value);
			
		}
		
		System.out.println("------------------------");
		
		//��ȡ���м�ֵ�Զ���ļ���
		Set<Entry<String,String>> set2 = map.entrySet();
		//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for (Entry<String, String> me : set2) {
			//���ݼ�ֵ�Զ����ȡ����ֵ
			String key2 = me.getKey();
			String value = me.getValue();
			System.out.println(key2+"----"+value);
			
		}
		
	}
}
