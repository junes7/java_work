package oop.chap07.poly;

public abstract class Beverage {
	//클래스 멤버변수 선언
	private String name;
	protected int price;
	//생성자 생성
	public Beverage() {
		
	}
	public Beverage(String name) {
		this.name=name;
	}
	//setter와 getter선언
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//추상 메소드
	public abstract void calcPrice();
	public void print() {
		System.out.println(name+"이며, 가격은 "+price+"\n");
	}
}
