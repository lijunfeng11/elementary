package com.test01;
/*
 * ����People�ĳ�����
 */

public abstract class People {

	// ��������name
	private String name;

	// �������Թ���
	private String country;
	
	
	//����һ��speak�ĳ��󷽷�
	public abstract void speak(String str);

	// �����в��޲�
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
