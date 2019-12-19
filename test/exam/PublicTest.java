package test.exam;
// 기본으로 인식하는 패키지의 위치는 java.lang패키지와 현재 작업 패키지
//-> 다른 패키지에 있는 클래스를 사용하는 경우  API나 내가 작성한 클래스나 모두 import
// 일반 클래스에서는 외부에서 클래스 멤버변수에 접근할 수 없도록 막아놓는 작업들을 한다.
// 필요할 때 적절한 인증처리를 거쳐서 메소드를 통해서 접근할 수 있도록 한다. 
import oop.chap06.Person;

public class PublicTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.name = "장동건";
		//p1.addr = "서울시"; // default이므로 외부 패키지에서 접근할 수 없다.
		//p1.age = 45; //private이므로 외부 패키지, 외부 클래스 모두 접근할 수 없다.
		
	}

}
