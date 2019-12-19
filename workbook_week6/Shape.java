package workbook_week6;

public abstract class Shape {
	//Ŭ���� ������� ����
	private int width;
	private int height;
	private String colors;
	//�⺻ ������ ����
	public Shape() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Shape(int width, int height, String colors) {
		this.width=width;
		this.height=height;
		this.colors=colors;
	}
	//�ʿ��� getter/setter ����
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
	//���� ���ϱ�
	public abstract double getArea();
}
