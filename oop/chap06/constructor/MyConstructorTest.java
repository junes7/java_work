package oop.chap06.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		//MyConstructor의 기본 생성자를 생성하지 않았지만
		//컴파일러가 스스로 찾아서 public MyConstructor();를 생성해 주었다.
		//기본 생성자를 호출해서 new를 통해 객체를 생성한후 setter메소드를 이용해서 값 초기화하기
		MyConstructor obj = new MyConstructor(/*"lee","jl","1234"*/);
		obj.setName("장동건");
		obj.setId("jang");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","+obj.getPass());
		//매개변수가 있는 생성자 메소드를 호출하면서 값을 초기화하기
		//MyConstructor(String,String,String)
		MyConstructor obj2 = new MyConstructor("장동건","jang","1234");
		System.out.println(obj2.getName()+","+obj2.getId()+","+obj2.getPass());
		System.out.println("=====================================================");
		//MyConstructor(String,String,String,String)
		MyConstructor obj3 = new MyConstructor("장동건","jang","1234","짱");
		System.out.println(obj3.getName()+","+obj3.getId()+","+obj3.getPass()+","+obj3.getNickname());
		//MyConstructor(String,String,String,String,String,int)
		MyConstructor obj4 = new MyConstructor("장동건","jang","1234","짱","서울",1000);
		System.out.println(obj4.getName()+","+obj4.getId()+","+obj4.getPass()+","+obj4.getNickname()+","+obj4.getAddr()+","+obj4.getPoint());		
	}
}
