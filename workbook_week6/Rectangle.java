package workbook_week6;

public class Rectangle extends Shape implements Resize {
	//기본 생성자 생성
	public Rectangle() {
		
	}
	//3개의 클래스 변수를 입력받는 생성자 생성
	public Rectangle(int width, int height, String colors) {
		super(width,height,colors);
	}
	//도형의 넓이를 리턴
	@Override
	public double getArea() {
		double area = (double)getWidth()*getHeight();
		return area;
	}
	//도형의 사이즈 변경
	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);		
	}
}
