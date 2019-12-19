package oop.chap07;
//StaticDemo를 테스트하는 클래스
//static으로 선언한 변수는 인스턴스의 고유한 값을 저장하는 인스턴스 변수가 아니므로
//인스턴스변수로 접근할 수 없다.
//클래스명으로 접근해야 한다.
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();
		System.out.println(obj1.num+","+obj1.staticNum);

		StaticDemo obj2 = new StaticDemo("obj2");
		obj2.display();
		System.out.println(obj2.num+","+obj2.staticNum);

		StaticDemo obj3 = new StaticDemo("obj3");
		obj3.display();
		System.out.println(obj3.num+","+obj3.staticNum);
	}
}