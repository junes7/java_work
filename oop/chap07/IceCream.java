package oop.chap07;

public class IceCream extends Dessert {
	//클래스 멤버변수 선언
	private int calorie;
	//생성자 생성
	public IceCream() {
		
	}
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName,price,count);
		this.calorie = calorie;
	}
	//setter와 getter생성
	
	
	
	//메소드 생성
	public static void print() {
		System.out.println("==============================");
		System.out.println("주문항목\t가격\t수량\t칼로리");
		System.out.println("==============================");		
	}
	public void printProductInfo() {
		/*System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+calorie);*/
		super.printProductInfo();
		System.out.println("\t"+calorie+"kcal");
	}
}