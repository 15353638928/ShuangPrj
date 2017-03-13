package com.god.learn;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Text2 {
	public static void main(String[] args) {
		
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
				System.out.println(array[i]);
			}
	
 		
	}
	public void f1(){
		
	}
}
