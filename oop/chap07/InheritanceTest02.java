package oop.chap07;
/*
 *   <<상속관계에서 메소드가 갖는 특징>>
 * 1. 상속관계에서는 상위클래스에 정의된 메소드를 하위클래스에서 사용할 수 있다.  
 *    (하위클래스 참조 변수를 통해서 접근할 수 있다.)
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하고
 *    사용할 수 있다. 이런 경우 하위클래스의 메소드가 호출된다.
 *    => 상위클래스에 선언된 메소드와 동일한 메소드를 하위클래스에 정의하는 것을
 *       메소드 재정의(메소드 오버라이딩)라고 한다.
 *                 ----------------
 *                 메소드 선언부가 부모클래스의 메소드 선언부와 반드시 일치해야 한다.
 *                 메소드명,매개변수 갯수,매개변수 타입,리턴타입 모두 동일해야 한다.
 * 3. 부모클래스의 메소드를 사용하고 싶은 경우 super로 호출한다.
 * 그러나 super는 main method 안에서만 쓸 수 있다.
 */

//import oop.chap07.poly.Parent;

class Parent {
	public void display() {
		System.out.println("부모의 display...");
	}
}

class Child extends Parent {
	//이 밑은 오버로딩이지 오버라이딩이 아니다.
	public void display(int num) {
		System.out.println("자식클래스의 display");
		super.display();
	}
	public void test() {
		System.out.println("자식클래스의 test...");
		display();
	}
}

public class InheritanceTest02 {
	public static void main(String [] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
		obj.display(1);
	}
}