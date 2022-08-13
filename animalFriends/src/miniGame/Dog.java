package miniGame;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		super.eat();
	}

	@Override
	public void walk() {
		this.hp -=2;
		super.walk();	// hp -1, feed +1
	}

	@Override
	public void play() {
		
		for (int i=0; i<5; i++) {
			
			System.out.println("멍멍~!~!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		super.play();
		
	}


	
	
	
	

	
	
}
