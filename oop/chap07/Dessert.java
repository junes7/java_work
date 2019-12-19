package oop.chap07;

public class Dessert {
	//클래스 멤버변수 선언
	private String productName;
	private int price;
	private int count;
	// 생성자 생성
	public Dessert() {
		
	}
	public Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	//setter와 getter 생성
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	// 메소드 생성
	public int getTotalPrice() {
		int totalprice = price*count;
		return totalprice;
	}
	public static void print() {
		System.out.println("=====================");
		System.out.println("주문항목\t가격\t수량");
		System.out.println("=====================");
	}
	public void printProductInfo() {
		System.out.print(productName+"\t"+price+"\t"+count);		
	}
	
}
