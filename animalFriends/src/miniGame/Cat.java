package miniGame;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void eat() {
		hp += 2;
		feed -= 2;
		super.eat();
	}

	@Override
	public void walk() {
		feed -= 2;
		super.walk();
	}

	
	@Override
	public void play() {
		
		for (int i=0; i<3; i++) {
			
			System.out.println("야옹~!~!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		super.play();
		
	}
	
	
	
	

}
