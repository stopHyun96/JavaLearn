package animalFriends;

public class Mouse extends Friends{

	public Mouse(String name, int cooltime) {
		super(name, cooltime);
	}

	@Override
	public void show() {
		super.show();
	}

	@Override
	public void eat() {
		hp += 4;
		
		super.eat();
	}

	@Override
	public void walk() {
		hp -= 4;
		
		super.walk();
	}

	@Override
	public void play() {
		super.play();
		
		System.out.println("찍찍~!~!");
	}
}
