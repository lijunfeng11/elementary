package com.test01;

/*
 * ����һ��������
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
		System.out.println("����Ϊ"+getName()+"��"+getCountry()+"����˵�� "+str);
		
	}

	@Override
	public void exercise() {
		System.out.println(getName()+"���ڶ����У������У�"+getName()+"Ϊ���˵�����");
		
	}

	//������Ա����
	public void life(String str) {
		speak(str);
		exercise();
	}
	
	
}
