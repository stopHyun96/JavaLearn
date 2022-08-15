package Atmtask;

import java.util.Random;
import java.util.Scanner;
public class AtmTask {

			//	미니 프로그램 만들기
			//
			//	미니 ATM 프로그램 만들기
			//
			//	1. 계좌 발급받기
			//		00-0000-0000
			//		비밀번호 설정하기 ( 네자리 )
			//		비밀번호 확인
			//		(계좌 개설 완료)
			//			>> 만약에 틀리면 다시 비밀번호 설정하기 단계로
			//			(기회 3번 틀리면 다시 첫화면으로)
			//
			//	2.입금하기 메뉴
			//		계좌번호 입력
			//		비밀번호 입력(횟수 제한 3회)
			//		입금금액 입력
			//		입금성공
			//
			//	3.출금하기 메뉴
			//		계좌번호 입력
			//		비밀번호 입력(횟수 제한 3회)
			//		출금금액 입력
			//		잔액 확인후 출금성공/실패
			//
			//	4.프로그램 종료하기 메뉴
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();																		//계좌번호를 00-0000-0000 형식으로 랜덤하게 받을거임.
		
		int pass = 0;																					//비밀번호 변수
		int passWord = 0;
		int bank1 = r.nextInt(10,100);
		int bank2 = r.nextInt(1000,10000);															//랜덤 계좌번호
		int bank3 = r.nextInt(1000,10000);
		String account = String.valueOf(bank1);														
		String num = String.valueOf(bank2);															
		String ber = String.valueOf(bank3);
		String bank = account + "-" + num  + "-" + ber;												//계좌번호 변수
		
		int count = 0;																					//비밀번호 입력 횟수
		long balance = 0;																				//계좌 잔액
		
			System.out.println("----- 미니 ATM 프로그램 만들기 -----");
			System.out.println("계좌번호 발급 받기 --> Enter");
			String give = sc.nextLine();
			
			System.out.println("당신의 계좌번호는 : " + bank1 + "-" + bank2 + "-" + bank3 + "입니다.\n");		//랜덤한 숫자의 조합으로 계좌번호 자동 발급
			
			
			
			
			System.out.print("비밀번호를 생성합니다. --> \n");
			pass = sc.nextInt();
			
			if(pass > 9999) {
				System.out.println("비밀번호는 네자리로만 가능합니다.");											//비밀번호의 범위를 1000 ~ 9999 의 네자리로 제한함.
			}else if(pass < 1000) {
				System.out.println("비밀번호는 네자리로만 가능합니다.");
				
			}
			
			
			
			
		while(true) {
			
			System.out.print("비밀번호를 확인합니다. --> \n");
			passWord = sc.nextInt();
			if (passWord != pass) {
				count ++;																				//비밀번호를 틀릴 시 카운트가 1회 누적 됨.
				} else {
				count = 0;																				//비밀번호를 맞추면 카운트는 다시 0으로 돌아감.
				}
			
			if(count == 3) {
				System.out.println("비밀번호를 3회 잘못 입력하여 프로그램을 종료합니다.");
				System.exit(0);																			//프로그램 종료
			}else if(pass == passWord) {
				System.out.println("계좌 개설이 완료되었습니다.\n\n\n");
				break;
			}else {
				System.out.println("잘못된 비밀번호 입니다.");
			}
		}
		
		
		
		
		
		
		
		while (true) {
			
			System.out.println("어떤 메뉴를 이용하시겠습니까?\n");
			System.out.println("1.입금하기");
			System.out.println("2.출금하기");
			System.out.println("3.프로그램 종료");
			
			System.out.print("번호를 입력하세요 --> ");
			int enter = sc.nextInt();
			
			switch(enter) {
			
			case 1 :																					//1번 선택시 이동
				while (true) {
					System.out.print("계좌번호를 입력해주세요. --> ");
					String inputBank = sc.next();
					
					if (inputBank.equals(bank)) {
						break;
					}else {
						System.out.println("잘못된 계좌번호입니다.");
					}
				}
				
				while(true) {
					System.out.print("비밀번호를 입력해주세요. --> ");
					passWord = sc.nextInt();
					if (passWord != pass) {
						count ++;
					}else {
						count = 0;
					}
					
					if(count == 3) {
						System.out.println("비밀번호를 3회 잘못 입력하여 처음으로 돌아갑니다.");
						break;
					}else if(passWord != pass) {
						System.out.println("잘못된 비밀번호 입니다.");
					}else {
						break;
					}
				}
				System.out.print("입금할 금액을 입력해주세요. --> ");
				long deposit = sc.nextLong();															//입금 금액 입력
				
				if(deposit > 0) {
					System.out.println("입금이 완료되었습니다.");
					balance += deposit; 																//잔액 + 입금액
					System.out.println("현재 계좌 잔액은 " + balance + "원 입니다.");
					break;
				}
				break;
				
			case 2 :																					//2번 선택시 이동
				while (true) {
					System.out.print("계좌번호를 입력해주세요. --> ");
					String inputBank = sc.next();
					
					if (inputBank.equals(bank)) {
						break;
					}else {
						System.out.println("잘못된 계좌번호입니다.");
					}
				}
				
				while(true) {
					System.out.print("비밀번호를 입력해주세요. --> ");
					passWord = sc.nextInt();													
					if (passWord != pass) {
						count ++;
					}else {
						count = 0;
					}
					
					if(count == 3) {
						System.out.println("비밀번호를 3회 잘못 입력하여 처음으로 돌아갑니다.");
						break;
					}else if(passWord != pass) {
						System.out.println("잘못된 비밀번호 입니다.");
					}else {
						break;
					}
				}
				System.out.print("출금할 금액을 입력해주세요. --> ");
				long withdraw = sc.nextLong();															//출금 금액 입력
				
				if(withdraw > 0) {
					System.out.println("출금이 완료되었습니다.");
					balance -= withdraw; 																//잔액 - 출금액
					System.out.println("현재 계좌 잔액은 " + balance + "원 입니다.");
					break;
				}
				break;
				
			case 3 :																					//3번 선택시 이동
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
					
		}
		
	}
}
