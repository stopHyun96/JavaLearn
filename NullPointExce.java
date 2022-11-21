package day04;

public class NullPointExce {
	public static void main(String[] args) {
//		String data = null;	//data는 객체를 참조하지 않는다.
//		System.out.println(data.toString());
		
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
	}
}
