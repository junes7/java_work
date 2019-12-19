package oop.chap06;

import java.util.Scanner;

public class PersonTest_Insa {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("*********인사괸리시스템***********");
		System.out.println("1. 인사등록");
		System.out.println("2. 정보수정");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 사원목록조회");
		System.out.print("원하는 작업을 선택하세요:");
		int work = key.nextInt();
		//person 클래스 멤버변수와 사용자가 등록한 정보의 지역 변수 이름을 동일하게 하는 이유
		//framework에서 수 많은 데이터들이 왔을 때 구분하기도 쉽고 참조하기도 수월하기 때문이다. 
		switch(work) {
			case 1:
				System.out.println("=====인사등록=====");
				System.out.print("성명:");
				String name = key.next();
				System.out.print("주소:");
				String addr = key.next();
				System.out.print("나이:");
				int age = key.nextInt();
				Person p = new Person();
				//p.name은 person객체의 name변수 = 사용자가 입력한 name값
/*				p.name = name;
				p.addr = addr;
				p.age = age;
				System.out.println(p.name+","+p.addr+","+p.age);*/
				break;
			case 2:
				System.out.println("=========정보수정하기=========");
				
			case 3:
				
		}
	
	}
}