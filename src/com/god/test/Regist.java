package com.god.test;

import java.util.Scanner;

import zuoye1.Entity;

public class Regist {
	Scanner in=new Scanner(System.in);
	public int count=0;
	User[] en=new User[5];
	public void jm(){
		boolean bool=false;
		do{
			System.out.println("请输入要选的项：1.申请  2.查看   3.登录");
			int num=in.nextInt();
			switch(num){
				case 1:
					news();
					//System.out.println("申请 ");
				bool=true;
				break;
				case 2:
					//System.out.println("查看 ");
					select();
					bool=true;
				break;
				case 3:
					System.out.println(jg());
					//System.out.println("登录");
					bool=true;
				break;
				default:
					System.out.println("输入有误！");
					bool=false;
				break;
			}
		}while(bool);
		
	}
	public void news(){
		System.out.println("账户申请");
		en[count]=new User();
		en[count].user=in.next();
		System.out.println("密码申请");
		en[count].pass=in.nextInt();
		if(en[count].user.length()>=6){
			System.out.println("申请成功");
			if(count<=5){
				count++;
			}else{
				System.out.println("申请失败");
			}
		}
	}
	public boolean dl(){
		boolean bool=false;
		System.out.println("登录账户");
		String names=in.next();
		System.out.println("登录密码");
		int password=in.nextInt();
		for(int i=0;i<en.length;i++){
			if(en[i]!=null){
				if(names.equals(en[i].user)&&en[i].pass==password){
					bool=true;
					break; 
				}else{
					bool=false;
				}
				}
			}
			return bool;
	}
	public String jg(){
		boolean bool=dl();
		if(bool){
			
			return"登录成功";		
		}else{
			return"账户或密码错误";
		}
	}
	public void select(){
		//User[] en=new User[5];
		System.out.println("账户 \t 密码");
		for(int i=0;i<en.length;i++){
			if(en[i]!=null){
				//此程序最多储存5对账户密码，档直接按2的时候印前期无保存所以显示错误 
				System.out.println(en[i].user+"\t"+en[i].pass);
			}
		}
	}
}
