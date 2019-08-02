package com.ithiema_day12_homework03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
	����˵����ArrayList����Ƕ��HashMap���ϲ�������
	����һ��ArrayList���ϣ�����������Ԫ�أ�ÿһ��Ԫ�ض���HashMap���͵ġ�ÿһ��HashMap���ϵļ���ֵ����String���͵ģ�
		����String		�ɷ������
		ֵ��String		���ӵ�����
		
	�������µ��ַ������ݣ����ô���ʵ������
	
	��һ��HashMap���ϵ�Ԫ�أ�
		���		����
		���		С��
	�ڶ���HashMap���ϵ�Ԫ�أ�
		����		����
		���		С��Ů
	������HashMap���ϵ�Ԫ�أ�
		�����	��ӯӯ
		��ƽ֮	����ɺ

 */
public class Test {

	public static void main(String[] args) {
		//�������������
		ArrayList<HashMap<String,String>> list = new ArrayList<>();
		
		//����Ԫ�ض���
		HashMap<String,String> hm1 = new HashMap<>();
		hm1.put("���", "����");
		hm1.put("���", "С��");
		
		HashMap<String,String> hm2 = new HashMap<>();
		hm2.put("����", "����");
		hm2.put("���", "С��Ů");
		
		HashMap<String,String> hm3 = new HashMap<>();
		hm3.put("�����", "��ӯӯ");
		hm3.put("��ƽ֮", "����ɺ");
		
		
		//���Ԫ��
		list.add(hm2);
		list.add(hm3);
		list.add(hm1);
		
		//����
		for (HashMap<String, String> hashMap : list) {
			Set<String> keySet = hashMap.keySet();
			for (String key : keySet) {
				String value = hashMap.get(key);
				System.out.println(key+"---"+value);
			}
			System.out.println();
		}
		
	}
}
