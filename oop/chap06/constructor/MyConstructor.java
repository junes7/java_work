package oop.chap06.constructor;
//생성자 연습
public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	//생성자명은 클래스 명과 같아야 한다.
	//생성자 메소드도 일반 메소드처럼 오버로딩을 허용한다.
	//처리되는 일이 없다고 하더라도 무조건 기본 생성자는 정의해야 한다.
	public MyConstructor() {
		System.out.println("기본 생성자");
	}
	//로그인용
	public MyConstructor(String name, String id, String pass) {
		//System.out.println("기본 생성자");
		System.out.println("매개변수 3개 있는 생성자");
		//멤버변수(인스턴스변수,객체변수)를 초기화
		this.name=name;
		this.id=id;
		this.pass=pass;
	}
	//수정용
	public MyConstructor(String name, String id, String pass, String nickname) {
		this(name,id,pass); //기존에 작성해 놓은 매개변수 3개의 생성자를 호출
		//입력해 놓은 3개의 매개변수와 함께 위의 매개변수 3개 생성자 메소드로 올라가서 값을 입력한다.
		//constructor call must be the first statement in a constructor. 
		//기존에 작성해 놓은 생성자를 호출할 때 생성자의 맨 첫번째로 이 값들을 호출해야 한다.
		System.out.println("매개변수 4개 있는 생성자");
/*		this.name=name;
		this.id=id;
		this.pass=pass;
*/		this.nickname = nickname;
	}
	//조회용
	public MyConstructor(String name, String id, String pass, String nickname, String addr) {
		this(name,id,pass,nickname);
		System.out.println("매개변수 5개 생성자");
/*		this.name=name;
		this.id=id;
		this.pass=pass;
		this.nickname = nickname;*/
		this.addr=addr;
	}
	//삽입용
	public MyConstructor(String name, String id, String pass, String nickname, String addr, int point) {
		System.out.println("매개변수 6개 생성자");
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.nickname = nickname;
		this.addr=addr;
		this.point=point;
	}
	//class 멤버변수 setter와 getter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
