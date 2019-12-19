package oop.chap07.poly;
/* 추상클래스 - abstract의 의미
 * 미완성된 클래스, 모든 내용이 구현이 되어었지 않은 클래스로 완성되지 않았으므로
 * 객체생성을 할 수 없다. -------------------------
 * 						메소드의 body가 구현되지 않은 메소드를
 * 						갖고 있는 클래스 (추상메소드)
 * 1) 추상메소드를 선언하는 방법
 * 	  접근제어자 abstract 리턴타입 메소드명(매개변수 list......);
 *	 =>추상메소드가 정의된 클래스는 미완성된 추상클래스가 되므로 일반 클래스와 다르다.
 *	   추상클래스를 정의하는 경우 클래스 선언부에서 abstract를 추가해야 한다.
 * 2) 추상클래스의 특징
 * 	 -일반메소드와 추상메소드 모두 정의할 수 있다.
 * 	 -추상메소드가 한 개라도 정의되어 있는 클래스는 반드시 abstract를 추가해야 한다.
 * 	 -추상클래스는 인스턴스화 할 수 없다.(객체생성불가능)
 * 	 -추상클래스(abstract클래스)를 상속하면 에러가 발생한다.
 *    ???????
 *   => AbstractSub클래스에서 abstract메소드를 갖고 있는
 *   AbstractSuper클래스를 상속하면서 AbstractSub클래스도 추상클래스가 되었다.
 *   
 *   [하위클래스에서의 해결방법]
 *   1. 상위클래스가 사용될 목적으로 만들어진 클래스라면 클래스 선언부에 abstract 추가한다.
 *   2. 모든 추상메소드를 반드시 오버라이딩해야 한다.
 * 3) 추상클래스와 추상메소드를 작성하는 이유
 *  -다형성을 적용하기 위해서
 * 	-상위클래스로 사용하기 위한 목적(객체생성을 문법으로 제한하기 위해)
 *  -하위클래스로 반드시 재정의해야하는 메소드를 문법으로 정의하여 반드시
 *  재정의하도록 하기 위해서
 */
abstract class AbstractSuper {
	public abstract void show(); //추상메소드
	public void display() { //일반메소드
		System.out.println("display");
	}
} 
class AbstractSub extends AbstractSuper {
	@Override
	public void show() {
				
	}
}

public class AbstractTest {
	public static void main(String[] args) {
		//AbstractSuper obj = new AbstractSuper();
	}
}
