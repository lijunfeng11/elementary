package com.itheima.day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		// Collection<String> list = new ArrayList<>();

		List<String> list = new ArrayList<String>();
		// ���
		list.add("f");
		list.add("lilil");
		list.add("jjjj");
		// System.out.println(list);

		// ���
		// list.clear();
		// System.out.println(list);

		// �Ƴ�
		// list.remove("f");
		// System.out.println(list);

		// �ж��Ƿ�Ϊ��
		// System.out.println(list.isEmpty());

		// �жϼ������Ƿ�������ַ�
		// System.out.println(list.contains("f"));

		// �� �� �� �� �� �� �� ��
		// System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			if(i==list.size()) {
				System.out.print(string);
			}else {
				System.out.print(string+", ");
			}
			
		}
		
		/*�����쳣
			Iterator<String> iterator = list.iterator();
			while(iterator.hasNext()) {
				String next = iterator.next();
				if(next.equals("f")) {
					boolean add = list.add("j");
					System.out.println(add);
				}
			}
		 */
		
		/*for (String s : list) {
			if(s.equals("f")) {
				list.add("j");
			}
		}*/
	}
}