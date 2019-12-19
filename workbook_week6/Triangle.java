package workbook_week6;

public class Triangle extends Shape implements Resize {
	//기본 생성자 생성
	public Triangle() {
		
	}
	//3개의 클래스 변수를 입력받는 생성자 생성
	public Triangle(int width, int height, String colors) {
		super(width,height,colors);
	}
	//도형의 넓이를 리턴
	@Override
	public double getArea() {
		double area = 0.0;
		area = (double)getWidth()*getHeight()/2;
		return area;
		//return getWidth()*getHeight()/2;도 가능하다.
	}
	//도형의 사이즈 변경
	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);		
	}
}
