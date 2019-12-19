package workbook_week7;

public class Rectangle extends Shape implements Movable{
	//클래스 멤버변수 선언
	private int width;
	//생성자 생성
	public Rectangle() {
		
	}
	//클래스 멤버변수 3개 입력받는 생성자 생성
	public Rectangle(int width, int x, int y) {
		//여기서 Point클래스 멤버변수를 선언해 주었기 때문에 point클래스 변수를 사용할 수 있다.
		super(new Point(x,y));
		this.width=width;
	}
	//필요 getter/setter 생성
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}	
	//필요한 메소드 생성
	//도형의 넓이 구하기
	@Override
	public double getArea() {
		double area = width*width;
		return area;
	}
	//도형의 둘레 구하기
	@Override
	public double getCircumference() {
		double circum = (2*width)+(2*width);
		return circum;
	}
	//도형의 좌표 구하기
	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
	}
	//출력하기
	public String printInfo() {
		String print = " ";
		print = width+" "+point.getX()+" "+point.getY();
		return print;
	}
}
