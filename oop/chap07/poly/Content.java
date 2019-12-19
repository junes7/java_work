package oop.chap07.poly;

public abstract class Content {
	//클래스 멤버변수 선언
	String title;
	int price;
	//생성자 생성
	//기본생성자
	public Content() {
		super();
	}
	//title을 매개변수로 받는 생성자
	public Content(String title) {
		this.title = title;
	}
	//메소드 선언
	//추상메소드
	public abstract void totalPrice();
	//출력하기
	public void show()
	{
		System.out.println(title+"비디오의 가격은 "+price+"원 입니다.");
	}
	//setter와 getter 선언
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
