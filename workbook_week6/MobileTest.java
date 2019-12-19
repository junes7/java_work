package workbook_week6;

public class MobileTest {
	public static void main(String[] args) {
		//각각의 모바일 객체 생성
		Mobile[] mob = new Mobile[2];
		mob[0] = new Ltab("Ltab",500,"AP-01");
		mob[1] = new Otab("Otab",1000,"AND-20");
		//생성된 객체의 정보 출력
		Mobile.print();
		mob[0].print1();
		mob[1].print1();
		//각각의 Mobile 객체에 10분씩 충전
		System.out.println("\n10분 충전");
		mob[0].charge(10);
		mob[1].charge(10);
		//10분 충전 후 객체 정보 출력
		Mobile.print();
		mob[0].print1();
		mob[1].print1();
		//각각의 Mobile 객체에 5분씩 통화
		System.out.println("\n5분 통화");
		mob[0].operate(5);
		mob[1].operate(5);
		//5분 통화 후 객체 정보 출력
		Mobile.print();
		mob[0].print1();
		mob[1].print1();

	}
}
