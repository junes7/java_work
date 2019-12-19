package chap07_Book;

class Card{
	//상수지만 선언과 함께 초기화 하지 않고
	//생성자에서 단 한 번만 초기화 할 수 있다.
	final int NUMBER;
	final String KIND;
	//카드의 폭과 높이는 변하지 않기 때문에 상수로 고정 
	static int width = 100;
	static int height = 200;
	//초기화 메소드 생성
	//매개변수로 값을 받아와서 초기화
	Card(String kind, int num)
	{
		KIND = kind;
		NUMBER = num;
	}
	//default 값으로 초기화
	Card() {
		this("HEART", 1);
	}
	//Card 클래스에서 재 정의된 오버라이딩인가요?
	public String toString() {
		return KIND+" "+NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("Heart",10);
		//c.NUMBER = 5;
		//The final field Card.NUMBER cannot be assigned
		//상수로서 생성자에서 한 번만 초기화 되었기 때문에
		//더 이상 변경할 수 없다.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
