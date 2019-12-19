package workbook_week7;

public abstract class Shape {
	//클래스 멤버변수 선언
	protected Point point; //클래스 변수 선언
	//생성자 생성
	public Shape() {
		
	}
	//클래스 멤버변수 1개를 받을 수 있는 생성자 생성
	public Shape(Point point) {
		this.point = point;
	}
	//추상메소드로 표현해서 넓이랑 원주넓이 메소드 선언하기
	//넓이 구하기 - 도형의 넓이를 리턴
	public abstract double getArea();
	//원주넓이 구하기 - 도형의 둘레를 리턴
	public abstract double getCircumference();
	//문장 출력하기
	public static void print() {
		System.out.println("After Move .........");
	}
}
