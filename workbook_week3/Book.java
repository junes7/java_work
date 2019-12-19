package workbook_week3;

public class Book {
	// 클래스 멤버변수 정의
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	// 생성자 정의 및 생성
	public Book() {
		
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookDiscountRate=bookDiscountRate;
	}
	// setter와 getter 메소드 생성
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	// 
/*	public double getDiscountBookPrice() {
		return 
	}*/
	
}