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
			System.out.println("������Ҫѡ���1.����  2.�鿴   3.��¼");
			int num=in.nextInt();
			switch(num){
				case 1:
					news();
					//System.out.println("���� ");
				bool=true;
				break;
				case 2:
					//System.out.println("�鿴 ");
					select();
					bool=true;
				break;
				case 3:
					System.out.println(jg());
					//System.out.println("��¼");
					bool=true;
				break;
				default:
					System.out.println("��������");
					bool=false;
				break;
			}
		}while(bool);
		
	}
	public void news(){
		System.out.println("�˻�����");
		en[count]=new User();
		en[count].user=in.next();
		System.out.println("��������");
		en[count].pass=in.nextInt();
		if(en[count].user.length()>=6){
			System.out.println("����ɹ�");
			if(count<=5){
				count++;
			}else{
				System.out.println("����ʧ��");
			}
		}
	}
	public boolean dl(){
		boolean bool=false;
		System.out.println("��¼�˻�");
		String names=in.next();
		System.out.println("��¼����");
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
			
			return"��¼�ɹ�";		
		}else{
			return"�˻����������";
		}
	}
	public void select(){
		//User[] en=new User[5];
		System.out.println("�˻� \t ����");
		for(int i=0;i<en.length;i++){
			if(en[i]!=null){
				//�˳�����ഢ��5���˻����룬��ֱ�Ӱ�2��ʱ��ӡǰ���ޱ���������ʾ���� 
				System.out.println(en[i].user+"\t"+en[i].pass);
			}
		}
	}
}
