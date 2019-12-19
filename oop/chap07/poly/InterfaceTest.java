package oop.chap07.poly;

import javax.swing.JFrame;
//인터페이스를 사용하는 목적은 다중상속을 허용, 다형성을 적용할 수 있도록,
//			기본적으로 구현해야 하는 기능이 무엇인지 정의하기 위한 목적이다.
class GUITest extends JFrame{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		//클래스.메소드 JFrame안에 static으로 정의되어 있는 상수이다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		GUITest obj = new GUITest("인터페이스 연습");
	}
}
