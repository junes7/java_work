package workbook_week6;

public class ShapeTest {
	public static void main(String[] args) {
		//ShapeŸ���� ��ü�� ������ �� �ִ� ���� 6���� �迭�� ����
		Shape[] shape = new Shape[7];
		//Shape obj = null; �� ���� �ǹ�
		//System.out.println(obj.getArea());
		//(1.����)���� �־��� �����͸� ������� Shape type�� ��ü�� �����Ͽ�
		//6���� ���� ��ü�� �迭�� �ִ´�.
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		shape[6] = new Circle(0,0,"White",5);
		//��� ��ü�� ���� ������ ���� ������ forLoop�� �̿��Ͽ� ȭ�鿡 ����Ѵ�.
		System.out.println("�⺻ ����");
		for (int j = 0; j < shape.length; j++) {
			//�迭�� ����� ��ü�� Ÿ���� �˻�
/*			if(shape[j] instanceof Triangle) {
				//System.out.println("Triangle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
				System.out.println(shape[j].getClass().getName()+"\t\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			} else { //shape[j] instanceof Rectangle
				//System.out.println("Rectangle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
				System.out.println(shape[j].getClass().getName()+"\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			}*/
			//�迭�� ����� ��ü�� Ÿ���� �˻�
			String name = " ";
			if(shape[j] instanceof Rectangle) {
				name = "Rectangle";
			} else if(shape[j] instanceof Triangle) {
				name = "Triangle";
			} else {
				name = "Circle";
			}
			System.out.println(name+"\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			//���� for�� - 5.0���� �߰��� for��
			//�迭�̳� Collection�� �ٷ� �� ���
			//for���� �� �� ����ɶ�����
			//shape�迭���� ��� �ϳ��� ������ obj�� ���� �� �۾��Ѵ�.
/*			for (Shape obj : shape) {
				System.out.println(obj.getColors()); //obj == shape[i]
				//��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶�
				//��ü�� Ÿ���� üũ�� �Ŀ� �����Ѵ�.
				if(obj instanceof Rectangle) {
					((Rectangle)obj).setResize(5);
					name = "Rectangle";
				} else if(obj instanceof Triangle) {
					((Triangle)obj).setResize(5);
				}
			}*/
			
		}
		System.out.println();
		//��� ��ü���� for Loop���� �̿��Ͽ� setResize�Լ��� �̿��Ͽ�
		//5�� �Է��ϰ� ����� ���� �� ȭ�鿡 ����Ѵ�.
		for (int j = 0; j < shape.length; j++) {
			if(shape[j] instanceof Triangle) {
				((Triangle)shape[j]).setResize(5);
			} else if(shape[j] instanceof Rectangle) {
				((Rectangle)shape[j]).setResize(5);
			} else {
				((Circle)shape[j]).setResize(5);
			}
		}
		System.out.println("����� ���� �� ����");
		for (int j = 0; j < shape.length; j++) {
			if(shape[j] instanceof Triangle) {
				System.out.println("Triangle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			} else if(shape[j] instanceof Rectangle) {
				System.out.println("Rectangle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			} else {
				System.out.println("Circle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			}
		}
	}
}
