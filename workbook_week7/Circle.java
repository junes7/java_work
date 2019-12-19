package workbook_week7;

public class Circle extends Shape implements Movable {
	//클래스 멤버변수 생성
	private int radius;
	//생성자 생성
	public Circle() {
		
	}
	//클래스 멤버변수 3개 입력받는 생성자 생성
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius=radius;
	}
	//필요한 getter/setter 생성
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//필요한 메소드 생성
	//도형의 둘레 구하기
	@Override
	public double getArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	//도형의 좌표 구하기	
	@Override
	public double getCircumference() {
		double circum = 2*Math.PI*radius;
		return circum;
	}
	//도형의 넓이 구하기
	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+1);
		point.setY(point.getY()+y+1);
	}
	//출력하기
	public String printInfo() {
		String print = " ";
		print = radius+" "+point.getX()+" "+point.getY();
		return print;
	}
}
