package workbook_week7;

public class Point {
	//클래스 멤버변수 선언
	private int x;
	private int y;
	//생성자 생성
	public Point() {
		
	}
	//클래스 멤버변수 2개 입력받는 생성자 생성
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//필요한 getter/setter 생성
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
