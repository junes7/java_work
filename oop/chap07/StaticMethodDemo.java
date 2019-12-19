package oop.chap07;
//static메소드
// - static멤버를 제어하기 위한 용도
// -유틸리티처럼 사용하기 위한 용도
public class StaticMethodDemo {
	public static void staticTest1() {
		//1. static메소드에서 static 메소드 접근하기 - 일반적인 방법 가능
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display() {
		//2. non-static메소드에서 non-static메소드 호출 - 일반적인 방법 가능
		show();
		System.out.println("display()");
	}
	public static void staticTest2() {
		System.out.println("staticTest2");
	}
	public void show() {
		//3. non-static메소드에서 static메소드 호출 - 일반적인 방법으로 호출 가능
		staticTest2();
		System.out.println("show()");
	}

	public static void staticTest3() {
		//4. static메소드에서 non-static메소드 호출하기 - 
		//->non-static 메소드가 메모리에 없기 때문에 같은 클래스에서
		//정의된 메소드라고 하더라도 무조건 객체생성 후에 호출해야 한다.
		//1.메모리에 올려놓기
		StaticMethodDemo obj = new StaticMethodDemo(); 
		//2.메모리에 올린 클래스 메소드 호출하기
		obj.show();
		System.out.println("staticTest3()");
	}
}