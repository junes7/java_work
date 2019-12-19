package workbook_week6;

public class Circle extends Shape implements Resize {
	//클래스 멤버변수 선언
	private int radius;
	//생성자 생성
	public Circle() {
		
	}
	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}
	//getter/setter 생성
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void setResize(int size) {
		setRadius(getRadius()+size);
	}
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
