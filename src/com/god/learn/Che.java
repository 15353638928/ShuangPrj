package com.god.learn;

public class Che {
	public String pinpai;
	public String leixing;
	public String dingwei;
	public void gongneng(){
		System.out.println("����");
	}
	public void dingwei(){
		System.out.println("�ܳ�");
	}
	public void qudong(){
		System.out.println("ǰ��");
	}
	public static void main (String[] args){
		Che zashi=new Che();
		zashi.pinpai="��������";
		zashi.leixing="����";
		zashi.dingwei="�߼�";
		System.out.println("�������Ķ���Ϊ��");
		System.out.println(zashi.pinpai);
		System.out.println(zashi.leixing);
		System.out.println(zashi.dingwei);
		zashi.gongneng();
		zashi.dingwei();
		zashi.qudong();
		System.out.println();
		
	}
	
	

}


