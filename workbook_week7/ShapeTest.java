package workbook_week7;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[4];
		//(1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성하여
		//4개의 도형 객체를 배열에 넣는다.
		shape[0] = new Rectangle(4,7,5);
		shape[1] = new Rectangle(5,4,6);
		shape[2] = new Circle(6,6,7);
		shape[3] = new Circle(7,8,3);
		//모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력한다.
		ShapeTest.print(shape);
		//모든 객체들을 for Loop문을 이용하여 move()함수를 이용하여
		//x가 10증가, y가 10증가 되도록 변경한 후 객체 정보를 화면에 출력한다.
		for (int i = 0; i < shape.length; i++) {
			((Movable)shape[i]).move(10, 10);
		}
		//변경 정보 출력
		Shape.print();
		ShapeTest.print(shape);
	}
	//정보 출력하기
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