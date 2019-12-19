package oop.chap07;
/*
 * <<상속관계에서 생성자가 갖는 특징>>
 *
 * 1. 클래스의 모든 생성자메소드의 첫 번째 문장에는 부모클래스의 기본생성자를 호출하는 명령문이 생략되어 있다.
 * =>부모클래스도 메모리에 할당되어야 사용할 수 있으므로
 * =>부모의 생성자를 호출하는 방법은 super(...)
 *   super()는 부모의 매개변수 없는 기본생성자
 * => 이미 다른 생성자를 호출하는 경우에는 super()를 할 수 없다.
 *    this()를 호출하는 경우 super()를 호출할 수 없다.
 * 2. 모든 클래스의 최상위클래스는 java.lang.Object클래스
 * =>자바에서 실행되는 모든 객체가 갖는 공통의 특징을 정의한 클래스로
 * 상속받고 있는 클래스가 없는 경우 컴파일러가 자동으로 상속하도록 한다.
 * 기본생성자가 다 생략되어 있다.
 * 상위클래스가 갖고 있는 내용을 하위클래스가 전부 다 내려받아야 한다.
 * 3. 부모클래스에 정의되어 있는 멤버변수가 값을 셋팅해야 하는 경우에도
 * 	  하위클래스에서 전달될 수 있도록 정의한다.
 * 	 super(값1,값2...)를 통해 접근한다.
 *   ------------------------
 *   부모의 매개변수가 있는 생성자를 호출하는 방법
 */

class SuperA extends java.lang.Object {
	private String name;
	private int age;
	SuperA() {
		super();
	}
	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class SubA extends SuperA {
	String addr;
	int point;
	SubA() {
		super();
	//모든 생성자메소드의 첫 번째 문장에는 super()호출
	}
	SubA(String addr) {
		super();
		this.addr = addr;
	}
	SubA(String addr,int point) {
		this(addr);//현재 객체에 이미 정의되어 있는 또 다른 생성자를 호출한 것
		this.point = point;
	}
	SubA(String name,int age,String addr,int point) {
		//this(addr);//현재 객체에 이미 정의되어 있는 또 다른 생성자를 호출한 것
		//this.name = name;
		//this.age = age;
		super(name,age);
		//부모의 매개변수 2개 생성자를 호출. private로 되어있는 멤버변수에 정의한 것
		//super(String,int)
		this.addr = addr;
		this.point = point;
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("장동건",45,"서울시",1000);
		System.out.println(/*obj.name+*/","+obj.addr+","+/*obj.age+*/","+obj.point);
	}
}
