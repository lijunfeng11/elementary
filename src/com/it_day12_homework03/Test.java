package com.ithiema_day12_homework03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
	需求说明：ArrayList集合嵌套HashMap集合并遍历。
	定义一个ArrayList集合，它包含三个元素，每一个元素都是HashMap类型的。每一个HashMap集合的键和值都是String类型的，
		键：String		丈夫的姓名
		值：String		妻子的姓名
		
	给出如下的字符串数据，请用代码实现需求。
	
	第一个HashMap集合的元素：
		孙策		大乔
		周瑜		小乔
	第二个HashMap集合的元素：
		郭靖		黄蓉
		杨过		小龙女
	第三个HashMap集合的元素：
		令狐冲	任盈盈
		林平之	岳灵珊

 */
public class Test {

	public static void main(String[] args) {
		//创建集合类对象
		ArrayList<HashMap<String,String>> list = new ArrayList<>();
		
		//创建元素对象
		HashMap<String,String> hm1 = new HashMap<>();
		hm1.put("孙策", "大乔");
		hm1.put("周瑜", "小乔");
		
		HashMap<String,String> hm2 = new HashMap<>();
		hm2.put("郭靖", "黄蓉");
		hm2.put("杨过", "小龙女");
		
		HashMap<String,String> hm3 = new HashMap<>();
		hm3.put("令狐冲", "任盈盈");
		hm3.put("林平之", "岳灵珊");
		
		
		//添加元素
		list.add(hm2);
		list.add(hm3);
		list.add(hm1);
		
		//遍历
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
