package oop.chap07.poly;

import javax.swing.JFrame;
//�������̽��� ����ϴ� ������ ���߻���� ���, �������� ������ �� �ֵ���,
//			�⺻������ �����ؾ� �ϴ� ����� �������� �����ϱ� ���� �����̴�.
class GUITest extends JFrame{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		//Ŭ����.�޼ҵ� JFrame�ȿ� static���� ���ǵǾ� �ִ� ����̴�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		GUITest obj = new GUITest("�������̽� ����");
	}
}
