package animalFriends;

public class Dog extends Friends{

	public Dog(String name, int cooltime) {
		super(name, cooltime);
		
	}


	@Override
	public void show() {
		super.show();
	}

	@Override
	public void eat() {
		super.eat();
	}

	@Override
	public void walk() {
		hp -= 2;
		
		super.walk();
	}

	@Override
	public void play() {
		super.play();
		
		System.out.println("멍멍~!~!");
	}
}
