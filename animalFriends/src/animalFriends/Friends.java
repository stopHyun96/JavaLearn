package animalFriends;

public class Friends {

	int hp = 50;
	int feed = 50;
	int cooltime;
	String name;
	
	public Friends (String name, int cooltime) {
		this.name = name;
		this.cooltime = cooltime;
	}
	
	public void show() {
		System.out.println(this.name + "의 남은 HP : " + this.hp);
		System.out.println("현재 남은 먹이 : " + this.feed);
	}
	
	public void eat() {
		System.out.println(this.name + "이가 먹이를 먹습니다.");
		
		hp++;
		feed --;
		
		this.show();
	}
	
	public void walk() {
		System.out.println(this.name + "아 산책가자~!~!");
		
		hp--;
		feed ++;
		
		this.show();
	}
	
	public void play() {
		
	   System.out.println(this.name + "이와 놀고 있습니다.");
	      
	      for(int i=0; i < this.cooltime ; i++) {
	         System.out.print(".....");
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	         
	            e.printStackTrace();
	         }
	      }
	      System.out.println();
	      
	      hp += 20;
	      feed += 20;
		
	      this.show();
		
		
	}
	
	
	
	
	
	
	
	
}
