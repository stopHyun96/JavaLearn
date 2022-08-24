package mvc;

public class MVC {
	public static void main(String[] args) {
		Student model = new Student();
		model.setStudentName("홍길동");
		model.setStudentNo(100000);
		View view = new View();
		Controller controller = new Controller(model, view);
		
		controller.updateView();
	}
}
	

//모델 : 데이터 구성
class Student {
	private int studentNo; // 학번
	private String studentName; // 이름
	
	// 접근, 데이터 반환
	
	//setter
	public void setStudentNo(int no) {
		this.studentNo = no;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	//getter
	public int getStudentNo () { return studentNo; }
	public String getStudentName() {return studentName;}
}

//뷰 : 화면 구성
class View {
	public void printStudents(int no, String name) {
		System.out.println("Student : ");
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + no);
	}
}

// 컨트롤러 징검다리
class Controller {
	private Student st; //모델
	private View v; //뷰
	
	public Controller(Student model, View view) {
		this.st = model;
		this.v = view;
	}
	
	public void updateView() {
		v.printStudents(st.getStudentNo(), st.getStudentName());
	}
}