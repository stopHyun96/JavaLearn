package iOGeneric;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO {
	
	public static void main(String[] args) {
		try {
			
			writeFile();	//파일 작성
			editFile();	//파일 수정하기
			readFile(); //파일읽기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//파일을 작성하는 메서드
	public static void writeFile() throws IOException{
		
		// 내가 원하는 내용을 파일에 입력해주는 클래스
		// ./out.txt는 출력을 할 파일 이름과 경로
		// ./  >> 내가 지금 있는 위치 (자바 프로그램 코드가 있는 위치)
		PrintWriter output = new PrintWriter("./out.txt");
		
//		for (int i = 0; i < 10; i++) {
//			String data = i + "번째 데이터";
//			output.println(data);
//		}
		
		String greeting = "Hello";
		output.println(greeting);
		
		output.close();	// 열었던 파일 닫기
	}
	
	// 파일을 수정하는 메서드
	public static void editFile() throws IOException {
		PrintWriter output = new PrintWriter(new FileWriter("./out.txt",true));
		String data = "World!";
		output.println(data);
		
		output.close();
		
	}
	
	// 파일을 읽어오는 메서드
	public static void readFile() throws IOException {
		// 파일의 내용을 가져오는 메서드
		BufferedReader br = new BufferedReader(new FileReader("./out.txt"));
		
		while (true) {
			String line = br.readLine();
			if (line == null) break;
				System.out.println(line);
		}
		
		br.close();
		
	}
}
