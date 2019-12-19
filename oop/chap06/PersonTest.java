package oop.chap06;
//Person클래스를 사용하는 클래스
//API class나 내가 만든 클래스도 new 연산자를 이용해 heap에 올려놓고 사용한다.
//String은 참조(reference) 타입이라서 배열 타입처럼 초기값이 null로 나온다.
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("장동건");
		p1.setAddr("서울시");
		p1.setAge(45); // age변수는 private으로 선언되어 있으므로
					 // 같은 패키지의 클래스에서도 접근할 수 없다.
		System.out.println("성명:"+p1.getName());
		System.out.println("주소:"+p1.getAddr());
		System.out.println("나이:"+p1.getAge());
		// 아래와 같이 heap에 Person이라는 객체를 더 생성할 수 있다.
		Person p2 = new Person();
		p2.setName("김서연");
		p2.setAddr("인천시");
		p2.setAge(25);
		System.out.println("성명:"+p2.getName());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("나이:"+p2.getAge());
		
		Person p3 = new Person("장동건","서울시",45);
		System.out.println("성명:"+p3.getName());
		System.out.println("주소:"+p3.getAddr());
		System.out.println("나이:"+p3.getAge());
		Person p4 = new Person("김서연","인천시",45);
		System.out.println("성명:"+p4.getName());
		System.out.println("주소:"+p4.getAddr());
		System.out.println("나이:"+p4.getAge());
	}
}
