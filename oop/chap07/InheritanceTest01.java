package oop.chap07;
/*
 *<<상속관계에서 멤버변수가 갖는 특징>> 
 *1. 상속관계에서는 상위클래스에 정의된 멤버변수를 하위클래스에서 
 *   사용할 수 있다.(하위클래스 참조 변수를 통해서 접근할 수 있다.)
 *2. 상위클래스의 변수와 동일한 이름의 변수를 하위클래스에 정의하는 경우
 * 	 하위클래스의 멤버변수가 우선순위가 높다.
 *3. 부모클래스의 변수를 액세스 하려면 super클래스를 이용해서 접근한다.
 *   this -> 자기자신의 객체
 *   super -> 부모객체
 *4. 상위클래스에 private으로 선언된 변수는 상속관계에 있다고 하더라도 
 *   하위클래스에서 접근할 수 없다. 
 */
class Super {
	int num = 100;
}

class Sub extends Super {
	int num = 1000;
	public void display() {
		System.out.println("num=>"+num);
		//부모클래스의 변수를 액세스할 수 있다.
		System.out.println("부모의 num=>"+super.num);
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		//상위클래스는 하위클래스의 일반적인 내용을 정의하기 위해서 사용하는 
		//클래스이므로 주로 하위클래스를 생성해서 사용한다.
		Sub obj = new Sub();
		obj.display();
		System.out.println("main==>"+obj.num);
	}
}