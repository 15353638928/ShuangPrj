package com.god.learn;

public class Che {
	public String pinpai;
	public String leixing;
	public String dingwei;
	public void gongneng(){
		System.out.println("载人");
	}
	public void dingwei(){
		System.out.println("跑车");
	}
	public void qudong(){
		System.out.println("前驱");
	}
	public static void main (String[] args){
		Che zashi=new Che();
		zashi.pinpai="兰博基尼";
		zashi.leixing="超跑";
		zashi.dingwei="高级";
		System.out.println("这辆车的对象为：");
		System.out.println(zashi.pinpai);
		System.out.println(zashi.leixing);
		System.out.println(zashi.dingwei);
		zashi.gongneng();
		zashi.dingwei();
		zashi.qudong();
		System.out.println();
		
	}
	
	

}


