package miniGame;

public class Mouse extends Animal{

	public Mouse(String name) {
		super(name);
	}

	@Override
	public void eat() {
		hp += 4;
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}

	@Override
	public void play() {
		
		for (int i=0; i<10; i++) {
			
			System.out.println("찍찍~!~!");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		super.play();
		
	}
	
	
	
	
	
	
}
