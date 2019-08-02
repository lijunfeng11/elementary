package com.kaoshi;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// ：创建一个 ArrayList<String> 集合 list，
		ArrayList<String> list = new ArrayList<>();
		list.add("语文");
		list.add("数学");
		list.add("英语");
		list.add("物理");
		list.add("政治");
		
		//创建一个 Student 对象 stu
		Student stu = new Student("小明");
		//创建 RandomSubImpl 对象
		RandomSubImpl rs = new RandomSubImpl();
		
		rs.say();
		rs.randomChoose(stu, list);
		stu.showSubjects();
	}
}
