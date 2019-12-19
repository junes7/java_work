package workbook_week7;

public class Circle extends Shape implements Movable {
	//Ŭ���� ������� ����
	private int radius;
	//������ ����
	public Circle() {
		
	}
	//Ŭ���� ������� 3�� �Է¹޴� ������ ����
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius=radius;
	}
	//�ʿ��� getter/setter ����
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//�ʿ��� �޼ҵ� ����
	//������ �ѷ� ���ϱ�
	@Override
	public double getArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	//������ ��ǥ ���ϱ�	
	@Override
	public double getCircumference() {
		double circum = 2*Math.PI*radius;
		return circum;
	}
	//������ ���� ���ϱ�
	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+1);
		point.setY(point.getY()+y+1);
	}
	//����ϱ�
	public String printInfo() {
		String print = " ";
		print = radius+" "+point.getX()+" "+point.getY();
		return print;
	}
}
