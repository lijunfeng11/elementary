package com.test01;
/*
 * 创建People的抽象类
 */

public abstract class People {

	// 定义属性name
	private String name;

	// 定义属性国籍
	private String country;
	
	
	//定义一个speak的抽象方法
	public abstract void speak(String str);

	// 生成有参无参
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
