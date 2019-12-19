package workbook_week6;

public class Circle extends Shape implements Resize {
	//Ŭ���� ������� ����
	private int radius;
	//������ ����
	public Circle() {
		
	}
	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}
	//getter/setter ����
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
