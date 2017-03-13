package com.god.learn;

public class Ren {
	public String name;
	public int age;
	public String sex;
	public void chi(String name){
		System.out.println(name+"吃香的喝辣的");
	}
	public void shui(){
		System.out.println("睡大床");
	}
	public static void main (String[] args){
		Ren zaochuren=new Ren();
		zaochuren.name="lisi";
		zaochuren.age=70;
		zaochuren.sex="男";
		System.out.println(zaochuren.name);
		System.out.println(zaochuren.age);
		zaochuren.chi("赵四");
		Ren secondp=new Ren();
		secondp.chi("刘能");
	}
}

