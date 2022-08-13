package miniGame;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Dog d = new Dog(null);
		Cat c = new Cat(null);
		Mouse m = new Mouse(null);
		
		System.out.println("★☆★☆ 동물 친구들 ☆★☆★");
		
		while (true) {
			System.out.println("동물 친구를 입양해주세요.");
			
			System.out.println("1. 강아지");
			System.out.println("2. 고양이");
			System.out.println("3. 햄스터");
			System.out.println("4. 프로그램 종료");
			int choice = Integer.parseInt(sc.nextLine());
			
			
			if(choice == 1) {
				System.out.print("이름을 정해주세요. >> ");
				d.name = sc.nextLine();
				
				System.out.println(d.name + "이가 꼬리를 흔듭니다.");
				
				while(true) {
					System.out.println(d.name + "이와 무엇을 하시겠습니까?");
					System.out.println("1. 먹이주기");
					System.out.println("2. 산책하기");
					System.out.println("3. 놀아주기");
					System.out.println("4. 방생하기");
					int select = Integer.parseInt(sc.nextLine());
					
					if(select == 1) {
						System.out.println(d.name + "이가 먹이를 먹습니다.");
						d.eat();
					}else if(select == 2) {
						System.out.println(d.name + "아 산책가자~~!");
						d.walk();
					}else if(select == 3) {
						System.out.println(d.name + "이와 놀고 있습니다. . . 잠시 기다려주세요.");
						d.play();
					}else if(select == 4) {
						System.out.println("사랑스러운 " + d.name + "이가 당신을 슬픈 눈으로 바라봅니다.");
						System.out.println("1. 역시 안되겠어 다시 " + d.name + "이와 잘 지내보자");
						System.out.println("2. 안되는건 안되는거야");
						System.out.println("어떤 선택을 하시겠습니까? >> ");
						int exit = Integer.parseInt(sc.nextLine());
						
						if(exit == 1) {
							System.out.println("멍멍~!~!");
							System.out.println(d.name + "이가 꼬리를 흔들며 기뻐합니다.");
							continue;
						}else if(exit == 2) {
							System.out.println("정말 " + d.name + "이를 \"유기\"할건가요?");
							System.out.println("1. 유기한다");
							System.out.println("2. 역시 잘못 생각한것 같다.");
							int realExit = Integer.parseInt(sc.nextLine());
							
							if(realExit == 1) {
								System.out.println("당신의 책임없는 쾌락으로 한 생명이 가치를 잃었습니다.");
							}else if(realExit == 2) {
								System.out.println(d.name + "이는 당신에게 이미 한번 버려졌습니다.\n "
										+ "아무 것도 모를 줄 알았던 한낱 미물이 \n"
										+ "당신에게 배신감을 느끼며 제발로 떠나갑니다.");
								break;
							}else {
								System.out.println("한 생명과의 일방적인 이별을 결정 지을 용기도 없는 나약한 녀석");
								break;
							}
						}else {
							System.out.println("한 생명과의 일방적인 이별을 결정 지을 용기도 없는 나약한 녀석");
							break;
						}
						
					}
					System.exit(0);
				}//while
				
			}else if(choice == 2) {
				System.out.print("이름을 정해주세요. >> ");
				c.name = sc.nextLine();
				
				while(true) {
					System.out.println(c.name + "이와 무엇을 하시겠습니까?");
					System.out.println("1. 먹이주기");
					System.out.println("2. 산책하기");
					System.out.println("3. 놀아주기");
					System.out.println("4. 방생하기");
					int select = Integer.parseInt(sc.nextLine());
					
					if(select == 1) {
						System.out.println(c.name + "이가 먹이를 먹습니다.");
						d.eat();
						continue;
					}else if(select == 2) {
						System.out.println(c.name + "아 산책가자~~!");
						d.walk();
						continue;
					}else if(select == 3) {
						System.out.println(c.name + "이와 놀고 있습니다. . . 잠시 기다려주세요.");
						d.play();
						continue;
					}else if(select == 4) {
						System.out.println("사랑스러운 " + c.name + "이가 당신을 슬픈 눈으로 바라봅니다.");
						System.out.println("1. 역시 안되겠어 다시 " + c.name + "이와 잘 지내보자");
						System.out.println("2. 안되는건 안되는거야");
						System.out.println("어떤 선택을 하시겠습니까? >> ");
						int exit = Integer.parseInt(sc.nextLine());
						
						if(exit == 1) {
							System.out.println("야옹~!~!");
							System.out.println(c.name + "이가 그루밍 하며 기뻐합니다.");
							continue;
						}else if(exit == 2) {
							System.out.println("정말 " + c.name + "이를 \"유기\"할건가요?");
							System.out.println("1. 유기한다");
							System.out.println("2. 역시 잘못 생각한것 같다.");
							int realExit = Integer.parseInt(sc.nextLine());
							
							if(realExit == 1) {
								System.out.println("당신의 책임없는 쾌락으로 한 생명이 가치를 잃었습니다.");
							}else if(realExit == 2) {
								System.out.println(c.name + "이는 당신에게 이미 한번 버려졌습니다.\n "
										+ "아무 것도 모를 줄 알았던 한낱 미물이 \n"
										+ "당신에게 배신감을 느끼며 제발로 떠나갑니다.");
								break;
							}else {
								System.out.println("한 생명과의 일방적인 이별을 결정 지을 용기도 없는 나약한 녀석");
								break;
							}
						}else {
							System.out.println("한 생명과의 일방적인 이별을 결정 지을 용기도 없는 나약한 녀석");
							break;
						}
						
					}
					System.exit(0);
				}//while
				
			}else if(choice == 3) {
				System.out.print("이름을 정해주세요. >> ");
				m.name = sc.nextLine();
				
				while(true) {
					System.out.println(m.name + "이와 무엇을 하시겠습니까?");
					System.out.println("1. 먹이주기");
					System.out.println("2. 산책하기");
					System.out.println("3. 놀아주기");
					System.out.println("4. 방생하기");
					int select = Integer.parseInt(sc.nextLine());
					
					if(select == 1) {
						System.out.println(m.name + "이가 먹이를 먹습니다.");
						d.eat();
					}else if(select == 2) {
						System.out.println(m.name + "아 산책가자~~!");
						d.walk();
					}else if(select == 3) {
						System.out.println(m.name + "이와 놀고 있습니다. . . 잠시 기다려주세요.");
						d.play();
					}else if(select == 4) {
						System.out.println("사랑스러운 " + m.name + "이가 당신을 슬픈 눈으로 바라봅니다.");
						System.out.println("1. 역시 안되겠어 다시 " + m.name + "이와 잘 지내보자");
						System.out.println("2. 안되는건 안되는거야");
						System.out.println("어떤 선택을 하시겠습니까? >> ");
						int exit = Integer.parseInt(sc.nextLine());
						
						if(exit == 1) {
							System.out.println("찍찍~!~!");
							System.out.println(m.name + "이가 챗바퀴를 돌며 기뻐합니다.");
							continue;
						}else if(exit == 2) {
							System.out.println("정말 " + m.name + "이를 \"유기\"할건가요?");
							System.out.println("1. 유기한다");
							System.out.println("2. 역시 잘못 생각한것 같다.");
							int realExit = Integer.parseInt(sc.nextLine());
							
							if(realExit == 1) {
								System.out.println("당신의 책임없는 쾌락으로 한 생명이 가치를 잃었습니다.");
							}else if(realExit == 2) {
								System.out.println(m.name + "이는 당신에게 이미 한번 버려졌습니다.\n "
										+ "아무 것도 모를 줄 알았던 한낱 미물이 \n"
										+ "당신에게 배신감을 느끼며 제발로 떠나갑니다.");
								break;
							}else {
								System.out.println("한 생명과의 일방적인 이별을 결정 지을 용기도 없는 나약한 녀석");
								break;
							}
						}else {
							System.out.println("한 생명과의 일방적인 이별을 결정 지을 용기도 없는 나약한 녀석");
							break;
						}
						
					}
					System.exit(0);
				}//while
				
			}else if(choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("세 종류의 동물 친구들 중에 결정해주세요.");
			}
		}
	}
}
