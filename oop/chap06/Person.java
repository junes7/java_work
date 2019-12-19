package oop.chap06;
//클래스를 대표하는 변수가 지금까지는 main 함수 안에 정의되었다.
//클래스 특성을 나타내는 데이터: 멤버변수 or 필드
//멤버변수는 아주 특수한 상황이 아니라면 초기값을 주지 않는다.
//데이터 타입은 참조형, 기본형 모두 쓸 수 있다.
//클래스를 정의하고 멤버변수를 정의하는 방법
// -멤버변수를 정의할때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// -초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean false이다.
// -멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
// -멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역할을 한다.
// -접근 제어자가 사용될 수 있는 곳 -> 클래스, 멤버변수, 메서드, 생성자
// -public		접근 제한이 전혀 없다. 아무 곳에서나 접근 가능하다.
// -protected	같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
// -default 	같은 패키지 내에서만 접근이 가능하다.
// -private 	같은 클래스 내에서만 접근이 가능하다.
// 접근하는 방법: 메서드를 만들고 사용하는 방법
// 클래스를 정의할 때 멤버변수는 private로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
// public 메소드를 통해서 접근할 수 있도록 구현한다. 
public class Person {
	private String name;// 클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드(API에서 쓰는 용어)
	private String addr;
	private int age;
	public Person() {
		System.out.println("기본 생성자");
	}
	public Person(String name)
	{
		System.out.println("매개변수 1개 생성자");
		this.name = name;
	}
	public Person(String name, String addr)
	{
		this(name);
		System.out.println("매개변수 2개 생성자");
		this.addr = addr;		
	}
	public Person(String name, String addr, int age) {
		this(name, addr);
		System.out.println("매개변수 3개 생성자");
		this.age=age;
	}
	// 모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와
	// 값을 가져올 수 있는 메소드가 필요하다.
	// 이런 역할을 하는 메소드를 정의하는 경우
	// name변수에 값을 설정하는 메소드
	// 메소드명: set + 멤버변수명(첫 글자를 대문자로 바꾼)
	//		   setName
	// set메소드는 리턴 타입이 void이다. 이유: 값을 바꿔주는(setting)역할만 한다. 
	// 그래서 값을 설정하고 나서 돌려줄 요소가 없기 때문에
	// name = name 이렇게 사용하면 경고가 뜬다.
	// this.멤버변수 = 지역 매개변수
	public void setName(String name) { //setter메소드 : 값을 설정하기 위해 지역 매개변수로 가져와 멤버변수에 저장할 때 쓰는 메소드 
		this.name = name;
	}
	//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	//메소드명: get + 멤버변수명(첫 글자를 대문자 바꾼)
	//get은 매개변수는 없고 리턴 값은 있다.
	//		  getName
	//블럭안을 찾아보고 없으면 가장 가까운 곳의 name변수를 찾는다.
	//고로 this.name대신 name만 써주어도 된다.
	public String getName() // getter메소드 : 값을 가져와 출력할 때 쓰는 메소드
	{
		return this.name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
/*	String name;// 클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드(API에서 쓰는 용어)
	String addr;
	int age;*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
}