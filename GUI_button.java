package ex04.sample04;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI_button {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ��µ� ȭ���� ������ ���α׷��� �����Ѵ�.
			setTitle("�� ��");
			
			this.setLayout(new FlowLayout());
			/*
			JButton btn1 = new JButton("��ư1"); //��ư ��ü ����
			this.add(btn1);	// ��µ� ȭ�鿡 ��ư�� �߰��ض�
			
			JButton btn2 = new JButton("��ư2"); //��ư ��ü ����
			this.add(btn2);	// ��µ� ȭ�鿡 ��ư�� �߰��ض�
			
			JButton btn3 = new JButton("��ư3"); //��ư ��ü ����
			this.add(btn3);	// ��µ� ȭ�鿡 ��ư�� �߰��ض�
			
			JButton btn4 = new JButton("��ư4"); //��ư ��ü ����
			this.add(btn4);	// ��µ� ȭ�鿡 ��ư�� �߰��ض�
			
			ImageIcon img1 = new ImageIcon("D://jjh_java//resource//bear.png");
			ImageIcon img2 = new ImageIcon("D://jjh_java//resource//pen2.png");
			
//			��ư�� �̹��� �ֱ�
//			JButton btn5 = new JButton("��ư5", img1); //��ư ��ü ����
//			this.add(btn5);	// ��µ� ȭ�鿡 ��ư�� �߰��ض�
			
			
//			�̹��� �� �����
			JLabel lbl1 = new JLabel("���̺� 1");
			JLabel lbl2 = new JLabel(img2);
			this.add(lbl1);
			this.add(lbl2);
			
			
//			üũ�ڽ� �����
			JCheckBox chk1 = new JCheckBox("Java");
			JCheckBox chk2 = new JCheckBox("C");
			JCheckBox chk3 = new JCheckBox("Python");
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);
			
			
//			������ư �����
			JRadioButton rdo1 = new JRadioButton("JAVA");
			JRadioButton rdo2 = new JRadioButton("C");
			JRadioButton rdo3 = new JRadioButton("Python");
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			
//			������ư ����üũ �ȵǰ� �����
			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);
			
//			�޴��� �����
			String[] language = {"C", "Java", "JavaScript", "Python", "HTML", "JSP", "Oracle"};
			JList list = new JList(language);
			this.add(list);
			
//			���� �޴��� �����
			JComboBox combo = new JComboBox(language);
			this.add(combo);
			 */
			
//			��ư Ŭ���� ��ư�� ������ �Ķ������� �ٲ�.
			JButton btn1 = new JButton("Click");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btn1.setBackground(Color.BLUE);
				}
			});
			this.add(btn1);
			
			
			setSize(250, 250);	// (����ũ��, ����ũ��) --> �ȼ��� �ǹ��Ѵ�. --> ��µǴ� ȭ���� ũ�� ����
			setVisible(true);	// ���� ���̴� ȭ���� ����.
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}
