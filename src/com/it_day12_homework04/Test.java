package com.ithiema_day12_homework04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
	����˵����HashMap����Ƕ��ArrayList���ϲ�������
	����һ��HashMap���ϣ�����������Ԫ�أ�ÿһ��Ԫ�صļ���String���ͣ�ֵ��ArrayList���͡�
		����String			���������Ĳ����Ӿ�
		ֵ��ArrayList		���������
	ÿһ��ArrayList���ϵ�������String���͵ġ�
	
	�������µ��ַ������ݣ����ô���ʵ������
	
	��һ��ArrayList���ϵ�Ԫ�أ�(��������)
		�����
		����
	�ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
		��ɮ
		�����
	������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
		����
		³����

 */
public class Test {
	public static void main(String[] args) {
		// �������϶���
		HashMap<String, ArrayList<String>> hm = new HashMap<>();

		// ����Ԫ�ض���
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("�����");
		list1.add("����");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("��ɮ");
		list2.add("�����");

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("����");
		list3.add("³����");
		// ���Ԫ��

		hm.put("��������", list1);
		hm.put("���μ�", list2);
		hm.put("ˮ䰴�", list3);

		// ����
		// ����ȡֵ
		Set<String> set = hm.keySet();
		for (String key : set) {
			// ���ݼ�ȥ��ֵ
			ArrayList<String> value = hm.get(key);

			for (String string : value) {
				System.out.println(key + "---" + string);
			}

			System.out.println();
		}

		System.out.println("---------------");
		// ��ֵ�Զ���
		Set<Entry<String, ArrayList<String>>> entrySet = hm.entrySet();
		for (Entry<String, ArrayList<String>> entry : entrySet) {
			String key = entry.getKey();
			ArrayList<String> value = entry.getValue();
			for (String string : value) {
				System.out.println(key + "---" + string);
			}

			System.out.println();
		}

	}
}
