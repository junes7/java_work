package oop.chap06;
//MyMethod클래스에서 정의한 메소드를 사용하는 클래스
public class MyMethodTest {
	public static void main(String[] args) {
		System.out.println("***********프로그램 시작*******");
		MyMethod m = new MyMethod();
		// 1. 매개변수가 없고 리턴타입이 void인 메소드의 호출
		m.display();
		System.out.println("+++++++++++step1++++++++++++");
		m.display();
		System.out.println("+++++++++++step2++++++++++++");
		m.display();
		System.out.println("***********프로그램 종료*******");
		
		//2. 매개변수가 한 개, 리턴값이 없는 메소드의 호출
		//""이게 string 리터럴이다.
		m.display("★");
		m.display("※");
		m.display("▣");
		m.display("$",8);
		//m.display(20,"★");//display(int,string)
		m.display("#",7); //display(string,int)
		System.out.println("===========프로그램 종료=======");
		
		//매개변수와 리턴값이 있는 메소드의 호출
		//메소드를 호출하는 경우 리턴값이 존재하는 메소드라면
		//원기호 어떻게 쓰는 것인지? ㅇ+한자 키
		//① 리턴값과 동일한 타입의 변수를 선언해서 저장해 주어야 한다.
		//② 다른 메소드의 매개변수로 전달할 수 있다.
		int result = m.add(100, 200);
		System.out.println("메소드 호출 결과=>"+result);
		
		System.out.println("메소드 호출 결과=>"+m.add(200, 300));
	}
}