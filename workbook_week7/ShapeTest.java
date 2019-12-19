package workbook_week7;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[4];
		//(1.����)���� �־��� �����͸� ������� Shape type�� ��ü�� �����Ͽ�
		//4���� ���� ��ü�� �迭�� �ִ´�.
		shape[0] = new Rectangle(4,7,5);
		shape[1] = new Rectangle(5,4,6);
		shape[2] = new Circle(6,6,7);
		shape[3] = new Circle(7,8,3);
		//��� ��ü�� ���� ������ ���� ������ for Loop�� �̿��Ͽ� ȭ�鿡 ����Ѵ�.
		ShapeTest.print(shape);
		//��� ��ü���� for Loop���� �̿��Ͽ� move()�Լ��� �̿��Ͽ�
		//x�� 10����, y�� 10���� �ǵ��� ������ �� ��ü ������ ȭ�鿡 ����Ѵ�.
		for (int i = 0; i < shape.length; i++) {
			((Movable)shape[i]).move(10, 10);
		}
		//���� ���� ���
		Shape.print();
		ShapeTest.print(shape);
	}
	//���� ����ϱ�
	public static void print(Shape[] shape) {
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Rectangle) {
				System.out.println("Rectangle: "+((Rectangle)shape[i]).printInfo());
			} else if(shape[i] instanceof Circle) {
				System.out.println("Circle: "+((Circle)shape[i]).printInfo());
			}
		}
	}
}