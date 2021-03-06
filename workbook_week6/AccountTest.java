package workbook_week6;

public class AccountTest {
	public static void main(String[] args) {
		//account 객체 생성
		Account acc = new Account("441-0290-1203",500000.0,7.3);
		//account에 기본 정보 출력
		acc.print();
		System.out.println("계좌정보: "+acc.getAccount()+" "+acc.getBalance()+" "+acc.getInterestRate());
		//account에 -10원 입금 - Exception 처리
		try {
			acc.deposit(-10);
		} catch(Exception e) {
			System.out.println("입금 금액이 0보다 작습니다.");
		}
		//account에 600000원 출금 - Exception 처리
		try {
			acc.withdraw(600000);
		} catch(Exception e) {
			System.out.println("출금 금액이 0보다 작거나 현재 잔액보다 많습니다.");
		}
		//이자 출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.println("이자: "+acc.calculateInterest());		
	}
}
