package workbook_week6;

public abstract class Shape {
	//클래스 멤버변수 선언
	private int width;
	private int height;
	private String colors;
	//기본 생성자 생성
	public Shape() {
		
	}
	//3개의 클래스 변수를 입력받는 생성자 생성
	public Shape(int width, int height, String colors) {
		this.width=width;
		this.height=height;
		this.colors=colors;
	}
	//필요한 getter/setter 생성
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public String getColors() {
		return colors;
	}
	//넓이 구하기
	public abstract double getArea();
}
