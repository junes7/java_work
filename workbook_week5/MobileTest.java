package workbook_week5;

public class MobileTest {
	public static void main(String[] args) {
		//각각의 Mobile 객체 생성
		Ltab l1 = new Ltab("Ltab",500,"AP-01");
		Otab o1 = new Otab("Otab",1000,"AND-20"); 
		//생성된 객체의 정보 출력
		l1.print();
		l1.print1();
		o1.print1();
		//각각의 Mobile객체에 10분씩 충전
		l1.charge(10);
		o1.charge(10);
		//10분 충전 후 객체 정보 출력
		System.out.println("10분 충전");
		l1.print();
		l1.print1();
		o1.print1();
		//각각의 Mobile객체에 5분씩 통화
		l1.operate(5);
		o1.operate(5);
		//5분 통화 후 객체 정보 출력
		System.out.println("5분 통화");
		l1.print();
		l1.print1();
		o1.print1();		
	}
}