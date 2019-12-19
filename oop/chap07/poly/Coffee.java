package oop.chap07.poly;

public class Coffee extends Beverage {
	//클래스 멤버변수 선언
	static int amount;
	//생성자 생성
	public Coffee() {
		
	}
	public Coffee(String name) { //Coffee가 판매
		super(name);
		//주문되는 음료의 가격을 계산
		calcPrice();
		amount++;
	}
	//setter와 getter 선언
	//static 멤버를 액세스하기 위해서 static 메소드를 정의해서 액세스한다.
	public int getAmount() {
		return amount;
	}
	//calcPrice 오버라이드
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")) {
			super.setPrice(1500);
		} else if (getName().equals("CafeLatte")) {
			super.setPrice(2500);
		} else if (getName().equals("Cappuccino")) {
			super.setPrice(3000);
		}
	}
	
}
