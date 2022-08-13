package animalFriends;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Friends f = new Friends(null, 0);
		Dog d = new Dog(null, 0);
		Cat c = new Cat(null, 0);
		Mouse m = new Mouse(null, 0);
		
		System.out.println("☆★☆★ 동물 친구들 ☆★☆★");
		
		while(true) {
			System.out.println("1. 강아지");
			System.out.println("2. 고양이");
			System.out.println("3. 햄스터");
			System.out.println("4. 프로그램 종료");
			System.out.println("동물친구를 선택하세요 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			
			while(true) {
			
				
				if (choice == 1) {
					System.out.println("이름을 입력하세요 >> ");
					d.name = sc.nextLine();
					
					while(true) {
						System.out.println();
						System.out.println("1. 먹이주기");
						System.out.println("2. 산책하기");
						System.out.println("3. 놀아주기");
						System.out.println("4. 떠나기");
						System.out.println(d.name + "이와 무엇을 할까요? >> ");
						int select = Integer.parseInt(sc.nextLine());
						
						if (select == 1) {
							d.eat();
							
						}
						else if (select == 2) {
							d.walk();
							
						}
						else if (select == 3) {
							d.cooltime = 5;
							d.play();
							
						}else if (select == 4) {
							System.out.println(d.name + "이가 슬픈 눈으로 당신이 떠난 곳을 바라봅니다 . . . ");
							
							break;
						}else {
							System.out.println("잘못된 번호입니다.");
							continue;
							
						}//withDog if
					}//withDog while
						
				}else if (choice == 2) {
					System.out.println("이름을 입력하세요 >> ");
					c.name = sc.nextLine();
					
					while(true) {
						System.out.println();
						System.out.println("1. 먹이주기");
						System.out.println("2. 산책하기");
						System.out.println("3. 놀아주기");
						System.out.println("4. 떠나기");
						System.out.println(c.name + "이와 무엇을 할까요? >> ");
						int select = Integer.parseInt(sc.nextLine());
						
						if (select == 1) {
							c.eat();
							
						}
						else if (select == 2) {
							c.walk();
							
						}
						else if (select == 3) {
							c.cooltime = 3;
							c.play();
							
						}else if (select == 4) {
							System.out.println(c.name + "이가 슬픈 눈으로 당신이 떠난 곳을 바라봅니다 . . . ");
							
							break;
						}else {
							System.out.println("잘못된 번호입니다.");
							continue;
							
						}//withCat if
					}//withCat while
				}else if (choice == 3) {
					System.out.println("이름을 입력하세요 >> ");
					m.name = sc.nextLine();
					
					while(true) {
						System.out.println();
						System.out.println("1. 먹이주기");
						System.out.println("2. 산책하기");
						System.out.println("3. 놀아주기");
						System.out.println("4. 떠나기");
						System.out.println(m.name + "이와 무엇을 할까요? >> ");
						int select = Integer.parseInt(sc.nextLine());
						
						if (select == 1) {
							m.eat();
							
						}
						else if (select == 2) {
							m.walk();
							
						}
						else if (select == 3) {
							m.cooltime = 10;
							m.play();
							
						}else if (select == 4) {
							System.out.println(m.name + "이가 슬픈 눈으로 당신이 떠난 곳을 바라봅니다 . . . ");
							
							break;
						}else {
							System.out.println("잘못된 번호입니다.");
							continue;
							
						}//withMouse if
					}//withMouse while
					
				}else if (choice == 4) {
					break;
				}else {
					System.out.println("잘못된 번호입니다.");
					continue;
					
				}//if
			
			}//while(in)
			
			System.out.println("프로그램을 종료합니다.");
			break;
			
		}// while
		
		
		 
		
		
		
	}

}
