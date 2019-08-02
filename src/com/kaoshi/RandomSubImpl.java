package com.kaoshi;

import java.util.ArrayList;

public class RandomSubImpl implements RandomSub{

	public RandomSubImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void randomChoose(Student stu, ArrayList<String> list) {
		System.out.println("所选课程:[物理，英语]");
		
	}

	public void say() {
		System.out.println("课可以选课了！");
	}
}
