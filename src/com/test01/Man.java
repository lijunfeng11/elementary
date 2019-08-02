package com.test01;

/*
 * 创建一个男人类
 */
public class Man extends People  implements Movement{


	
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Man(String name, String country) {
		super(name, country);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak(String str) {
		System.out.println("姓名为"+getName()+"的"+getCountry()+"人在说着 "+str);
		
	}

	@Override
	public void exercise() {
		System.out.println(getName()+"正在锻炼中！”其中，"+getName()+"为男人的名字");
		
	}

	//创建成员方法
	public void life(String str) {
		speak(str);
		exercise();
	}
	
	
}
