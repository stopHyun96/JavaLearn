package animalFriends;

public class Cat extends Friends{
	
	public Cat(String name, int cooltime) {
		super(name, cooltime);
	}

	@Override
	public void show() {
		super.show();
	}

	@Override
	public void eat() {
		hp += 2;
		feed -= 2;
		
		super.eat();
	}

	@Override
	public void walk() {
		super.walk();
	}

	@Override
	public void play() {
		super.play();
		
		System.out.println("야옹~!~!");
	}
}
