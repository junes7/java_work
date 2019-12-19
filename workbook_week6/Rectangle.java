package workbook_week6;

public class Rectangle extends Shape implements Resize {
	//�⺻ ������ ����
	public Rectangle() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Rectangle(int width, int height, String colors) {
		super(width,height,colors);
	}
	//������ ���̸� ����
	@Override
	public double getArea() {
		double area = (double)getWidth()*getHeight();
		return area;
	}
	//������ ������ ����
	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);		
	}
}
