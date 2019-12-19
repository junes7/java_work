package workbook_week3;

public class AccountTest {
	public static void main(String[] args) {
		// account 객체 생성
		Account account = new Account("441-0290-1203",500000,7.3);
		// account 기본 정보 입력
/*		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);*/
		// account 기본 정보 출력
		account.print();
		// account 에 20000원 입금
		account.deposit(20000);
		// account 변경 정보 출력
		account.print();
		// 이자 출력 - 현재 잔고를 기존으로 고객에게 줄 이자 금액을 출력한다.
		account.print1();
	}
}
