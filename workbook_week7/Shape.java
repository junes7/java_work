package workbook_week7;

public abstract class Shape {
	//Ŭ���� ������� ����
	protected Point point; //Ŭ���� ���� ����
	//������ ����
	public Shape() {
		
	}
	//Ŭ���� ������� 1���� ���� �� �ִ� ������ ����
	public Shape(Point point) {
		this.point = point;
	}
	//�߻�޼ҵ�� ǥ���ؼ� ���̶� ���ֳ��� �޼ҵ� �����ϱ�
	//���� ���ϱ� - ������ ���̸� ����
	public abstract double getArea();
	//���ֳ��� ���ϱ� - ������ �ѷ��� ����
	public abstract double getCircumference();
	//���� ����ϱ�
	public static void print() {
		System.out.println("After Move .........");
	}
}
