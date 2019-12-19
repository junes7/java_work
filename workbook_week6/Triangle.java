package workbook_week6;

public class Triangle extends Shape implements Resize {
	//�⺻ ������ ����
	public Triangle() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Triangle(int width, int height, String colors) {
		super(width,height,colors);
	}
	//������ ���̸� ����
	@Override
	public double getArea() {
		double area = 0.0;
		area = (double)getWidth()*getHeight()/2;
		return area;
		//return getWidth()*getHeight()/2;�� �����ϴ�.
	}
	//������ ������ ����
	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);		
	}
}
