package com.test02;
/*
 * 定义一个菜单类Menu
 */
public class Menu {

	//如下属性
	//菜名
	private String name;
	//价格
	private int  jg;
	//菜系
	private String cx;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String name, int jg, String cx) {
		super();
		this.name = name;
		this.jg = jg;
		this.cx = cx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJg() {
		return jg;
	}
	public void setJg(int jg) {
		this.jg = jg;
	}
	public String getCx() {
		return cx;
	}
	public void setCx(String cx) {
		this.cx = cx;
	}
	@Override
	public String toString() {
		return "Menu [name=" + name + ", jg=" + jg + ", cx=" + cx + "]";
	}

	
}
