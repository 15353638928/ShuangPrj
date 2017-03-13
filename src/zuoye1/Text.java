package zuoye1;
	import java.util.*; 
public class Text {
	Scanner in=new Scanner(System.in);
	public int count=0;
	Entity[] en=new Entity[5];
	public void jm(){
		boolean bool=false;
		do{
			System.out.println("«Î ‰»Î“™—°µƒœÓ£∫1.…Í«Î  2.≤Èø¥   3.µ«¬º");
			int num=in.nextInt();
			switch(num){
				case 1:
					news();
				bool=true;
				break;
				case 2:
					select();
					bool=true;
				break;
				case 3:
					System.out.println(jg());
					bool=true;
				break;
				default:
					System.out.println(" ‰»Î”–ŒÛ£°");
					bool=false;
				break;
			}
		}while(bool);
		
	}
	public void news(){
		System.out.println("’Àªß…Í«Î");
		en[count]=new Entity();
		en[count].user=in.next();
		System.out.println("√‹¬Î…Í«Î");
		en[count].pass=in.nextInt();
		if(en[count].user.length()>=6){
			System.out.println("…Í«Î≥…π¶");
			if(count<=5){
				count++;
			}else{
				System.out.println("…Í«Î ß∞‹");
			}
		}
	}
		public boolean dl(){
			boolean bool=false;
			System.out.println("µ«¬º’Àªß");
			String names=in.next();
			System.out.println("µ«¬º√‹¬Î");
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
				return"µ«¬º≥…π¶";		
			}else{
				return"’ÀªßªÚ√‹¬Î¥ÌŒÛ";
			}
		}
		public void select(){
			System.out.println("’Àªß \t √‹¬Î");
			for(int i=0;i<en.length;i++){
				if(en[i]!=null){
					System.out.println(en[i].user+"\t"+en[i].pass);
				}
			}
		}

}

