package workbook_week4;

public class AccountTest {
	public static void main(String[] args) {
		Account account;
		//account 객체 생성
		account = new Account("441-0290-1203",500000,7.3);
		//account 기본 정보 출력
		account.print();
		//account에 20000원 입금
		account.deposit(20000);
		//account 변경 정보 출력
		account.print();
		//이자 출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.println("이자:" +account.calculateInterest());
	}
}