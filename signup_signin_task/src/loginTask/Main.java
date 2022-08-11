package loginTask;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//로그인 프로그램 만들기
		//String  타입의 id, pw, name을 가짐
		//모두 private 변수로
		
		//프로그램은
		//1. 회원가입
		//2. 로그인
		//3. 나가기 메뉴
		
		//1.을 누르면 이름, id, pw 입력받고
		//(한번에 모든 유저의 정보를 입력을 다 받는게 아니라,
		// 한번에 한 유저의 정보만 입력 받도록 하여 만들기)
		//2.누르면 아이디와 패스워드 입력하여 로그인
		
		
		
		System.out.println("--- Sign Up & LogIn ---");
		System.out.println();
		
		User[] user = new User[5];
		//User 클래스 객체배열
		
		while (true) {
			System.out.println("--- 메뉴를 선택하세요 ---");
			
			System.out.println("1.Sign Up");
			System.out.println("2.LogIn");
			System.out.println("3.Exit");
			
			int choice = Integer.parseInt(sc.nextLine());
			//메뉴선택
			
			System.out.println();
			
			
			User u = new User();							
			//User 클래스 객체화
			
			if(choice != 1 && choice != 2 && choice != 3) {
				System.out.println("없는 메뉴입니다.");
				break;
				
			}else if (choice == 3) {
				break;
				//프로그램 종료
			}//if
			
			switch(choice) {
			
			case 1 : 
				
				System.out.print("이름 입력 >> ");
				u.setName(sc.nextLine());
				System.out.print("ID 입력 >> ");
				u.setId(sc.nextLine());
				System.out.print("PW 입력 >> ");
				u.setPw(sc.nextLine());
				
				System.out.println();
				System.out.println("계정 생성이 완료되었습니다.");
				System.out.println();
				
				
				//입력한 정보를 User 클래스 배열에 저장.
				for (int i = 0; i < user.length; i++) {
					if (user[i] == null) {
						user[i] = u;
					}
				}//for
				
				break;
				
			case 2 :
				
				System.out.print(" ID :  ");
				String id = sc.nextLine();
				System.out.print(" PW :  ");
				String pw = sc.nextLine();
				
				for (int i = 0; i < user.length; i++) {
					
					if(id.equals(user[i].getId()) && pw.equals(user[i].getPw())) {
						System.out.println("-- 로그인 성공 --");
						System.out.println(user[i].getName() + "님 환영합니다.");
						System.out.println();
						break;
					}else {
						System.out.println("잘못된 정보입니다.");
						break;
					}//if
					
				}//for
				
				break;
				
			case 3 :
				
				break;
				
			}//switch
			
		}//while
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}//method

}//class
