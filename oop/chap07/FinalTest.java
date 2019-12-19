package oop.chap07;

class FinalSuper {
	public void display() {
		System.out.println("super display");
	}
}
final class FinalSub  extends FinalSuper{ //final 클래스는 상속이 불가능하다.
	//상수
	static final int NUM = 100;
	//오버라이드 선언 - 내용 변경
	@Override
	public void display() {
		System.out.println("display");
	}
	//final메소드는 오버라이딩 할 수 없다.
}
//@annotation은 컴파일러한테 오버라이드 되었다고 알려주는 기호이다.

public class FinalTest {
	public static void main(String[] args) {
		//자식 객체 선언
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000; //하위 클래스 멤버변수에 final이 쓰여 상수이므로 값을 수정할 수 없다.
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}
