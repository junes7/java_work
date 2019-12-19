package workbook_week6;

public class ShapeTest {
	public static void main(String[] args) {
		//Shape타입의 객체를 참조할 수 있는 변수 6개를 배열로 생성
		Shape[] shape = new Shape[7];
		//Shape obj = null; 과 같은 의미
		//System.out.println(obj.getArea());
		//(1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성하여
		//6개의 도형 객체를 배열에 넣는다.
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		shape[6] = new Circle(0,0,"White",5);
		//모든 객체의 넓이 정보와 색상 정보를 forLoop를 이용하여 화면에 출력한다.
		System.out.println("기본 정보");
		for (int j = 0; j < shape.length; j++) {
			//배열에 저장된 객체의 타입을 검사
/*			if(shape[j] instanceof Triangle) {
				//System.out.println("Triangle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
				System.out.println(shape[j].getClass().getName()+"\t\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			} else { //shape[j] instanceof Rectangle
				//System.out.println("Rectangle\t"+shape[j].getArea()+"\t"+shape[j].getColors());
				System.out.println(shape[j].getClass().getName()+"\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			}*/
			//배열에 저장된 객체의 타입을 검사
			String name = " ";
			if(shape[j] instanceof Rectangle) {
				name = "Rectangle";
			} else if(shape[j] instanceof Triangle) {
				name = "Triangle";
			} else {
				name = "Circle";
			}
			System.out.println(name+"\t"+shape[j].getArea()+"\t"+shape[j].getColors());
			//향상된 for문 - 5.0부터 추가된 for문
			//배열이나 Collection을 다룰 때 사용
			//for문이 한 번 실행될때마다
			//shape배열에서 요소 하나씩 꺼내서 obj에 전달 후 작업한다.
/*			for (Shape obj : shape) {
				System.out.println(obj.getColors()); //obj == shape[i]
				//객체의 타입을 변경하는 경우 무조건 변경하는 것이 아니라
				//객체의 타입을 체크한 후에 변경한다.
				if(obj instanceof Rectangle) {
					((Rectangle)obj).setResize(5);
					name = "Rectangle";
				} else if(obj instanceof Triangle) {
					((Triangle)obj).setResize(5);
				}
			}*/
			
		}
		System.out.println();
		//모든 객체들을 for Loop문을 이용하여 setResize함수를 이용하여
		//5를 입력하고 사이즈를 변경 후 화면에 출력한다.
		for (int j = 0; j < shape.length; j++) {
			if(shape[j] instanceof Triangle) {
				((Triangle)shape[j]).setResize(5);
			} else if(shape[j] instanceof Rectangle) {
				((Rectangle)shape[j]).setResize(5);
			} else {
				((Circle)shape[j]).setResize(5);
			}
		}
		System.out.println("사이즈를 변경 후 정보");
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
