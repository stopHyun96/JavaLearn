package miniGame;

public class Animal {

	int hp = 50;
	int feed = 50;
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(this.name + "의 현재체력 : " + this.hp);
		System.out.println("남은 먹이 갯수 : " + this.feed);
	}

	//먹이주기
	public void eat() {
		System.out.println(this.name + "이 밥을 먹습니다.");
		this.hp++;
		this.feed--;
		
		//남은 먹이 개수와, 체력 보여주기
		this.show();
	}
	
	//산책하기
	public void walk() {
		System.out.println(this.name + "아 산책하자");
		hp--;
		feed++;
		
		//남은 먹이 개수와, 체력 보여주기
		this.show();
	}
	
	//놀아주기
	public void play() {
		this.hp += 20;
		this.feed += 20;
		
		//남은 먹이 개수와, 체력 보여주기
		this.show();
	}
	
	
	
	
	
}
