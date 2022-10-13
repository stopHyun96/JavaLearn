package ex04.sample04;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI_button {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 출력된 화면을 닫으면 프로그램을 종료한다.
			setTitle("연 습");
			
			this.setLayout(new FlowLayout());
			/*
			JButton btn1 = new JButton("버튼1"); //버튼 객체 생성
			this.add(btn1);	// 출력된 화면에 버튼을 추가해라
			
			JButton btn2 = new JButton("버튼2"); //버튼 객체 생성
			this.add(btn2);	// 출력된 화면에 버튼을 추가해라
			
			JButton btn3 = new JButton("버튼3"); //버튼 객체 생성
			this.add(btn3);	// 출력된 화면에 버튼을 추가해라
			
			JButton btn4 = new JButton("버튼4"); //버튼 객체 생성
			this.add(btn4);	// 출력된 화면에 버튼을 추가해라
			
			ImageIcon img1 = new ImageIcon("D://jjh_java//resource//bear.png");
			ImageIcon img2 = new ImageIcon("D://jjh_java//resource//pen2.png");
			
//			버튼에 이미지 넣기
//			JButton btn5 = new JButton("버튼5", img1); //버튼 객체 생성
//			this.add(btn5);	// 출력된 화면에 버튼을 추가해라
			
			
//			이미지 라벨 만들기
			JLabel lbl1 = new JLabel("레이블 1");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);
			
			
//			체크박스 만들기
			JCheckBox chk1 = new JCheckBox("Java");
			JCheckBox chk2 = new JCheckBox("C");
			JCheckBox chk3 = new JCheckBox("Python");
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);
			
			
//			라디오버튼 만들기
			JRadioButton rdo1 = new JRadioButton("JAVA");
			JRadioButton rdo2 = new JRadioButton("C");
			JRadioButton rdo3 = new JRadioButton("Python");
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			
//			라디오버튼 다중체크 안되게 만들기
			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);
			
//			메뉴바 만들기
			String[] language = {"C", "Java", "JavaScript", "Python", "HTML", "JSP", "Oracle"};
			JList list = new JList(language);
			this.add(list);
			
//			선택 메뉴바 만들기
			JComboBox combo = new JComboBox(language);
			this.add(combo);
			 */
			
//			버튼 클릭시 버튼의 배경색이 파란색으로 바뀜.
			JButton btn1 = new JButton("Click");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn1.setBackground(Color.BLUE);
				}
			});
			this.add(btn1);
			
			
			setSize(250, 250);	// (가로크기, 세로크기) --> 픽셀을 의미한다. --> 출력되는 화면의 크기 설정
			setVisible(true);	// 눈에 보이는 화면을 띄운다.
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}
