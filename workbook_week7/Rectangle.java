package workbook_week7;

public class Rectangle extends Shape implements Movable{
	//Ŭ���� ������� ����
	private int width;
	//������ ����
	public Rectangle() {
		
	}
	//Ŭ���� ������� 3�� �Է¹޴� ������ ����
	public Rectangle(int width, int x, int y) {
		//���⼭ PointŬ���� ��������� ������ �־��� ������ pointŬ���� ������ ����� �� �ִ�.
		super(new Point(x,y));
		this.width=width;
	}
	//�ʿ� getter/setter ����
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}	
	//�ʿ��� �޼ҵ� ����
	//������ ���� ���ϱ�
	@Override
	public double getArea() {
		double area = width*width;
		return area;
	}
	//������ �ѷ� ���ϱ�
	@Override
	public double getCircumference() {
		double circum = (2*width)+(2*width);
		return circum;
	}
	//������ ��ǥ ���ϱ�
	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
	}
	//����ϱ�
	public String printInfo() {
		String print = " ";
		print = width+" "+point.getX()+" "+point.getY();
		return print;
	}
}
