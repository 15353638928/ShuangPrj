package com.god.learn;

public class Ren {
	public String name;
	public int age;
	public String sex;
	public void chi(String name){
		System.out.println(name+"����ĺ�����");
	}
	public void shui(){
		System.out.println("˯��");
	}
	public static void main (String[] args){
		Ren zaochuren=new Ren();
		zaochuren.name="lisi";
		zaochuren.age=70;
		zaochuren.sex="��";
		System.out.println(zaochuren.name);
		System.out.println(zaochuren.age);
		zaochuren.chi("����");
		Ren secondp=new Ren();
		secondp.chi("����");
	}
}

