package com.god.learn;

import java.util.Arrays;

public class Gou {
	public String name;
	public String age;
	public String sex;
	public void chi(){
		System.out.println("吃肉");
	}
	public void jiao(){
		System.out.println("狗这样叫");
	}
	public void jiao(String s123){
		System.out.println(s123+"狗这样叫");
	}
	public void jiao(int s123){
		System.out.println(s123+"狗这样叫");
	}
	public static void main(String[] args) {
		Gou daGou=new Gou();
		daGou.name="旺财";
		String goumingzi = daGou.name;
		daGou.jiao(goumingzi);
		daGou.jiao("小黑子");
		int[] array=new int[10];
		array[0]=22;
		array[1]=13;
		array[2]=51;
		array[3]=66;
		array[4]=3;
		array[5]=17;
		array[6]=33;
		array[7]=26;
		array[8]=103;
		array[9]=1000;
		Arrays.sort(array);
			for(int i=0;i<array.length;i++){
				//System.out.print(array[i]+" ");
				daGou.jiao(array[i]);
			}
	}
}
