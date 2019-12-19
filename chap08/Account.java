package chap08;

public class Account {
	//클래스 변수 선언
	private String account;
	private double balance;
	private double interestRate;
	//Constructor구현
	//기본 생성자 생성
	public Account() {
		
	}
	//3개의 클래스 변수를 입력받는 생성자 생성
	public Account(String account, double balance, double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	//getter/setter 구현
	//잔고와 이자율은 변할 수 있기에 구현해준다.
	public String getAccount() {
		return account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//필요 메소드 생성
	public double calculateInterest() {
		//이자계산
		return balance*interestRate/100;
	}
	public void deposit(double money) throws Exception {
		//입금 처리 및 예외상황 처리
		if(money < 0) {
			throw new Exception("입금 금액이 0보다 작습니다.");
		}
		balance+=money;
	}
	public void withdraw(double money) throws Exception {
		//출금 처리 및 예외상황 처리
		//throw new exception했을 때 늘 빨간 밑줄이 보이는 것은 아니다.
		//RuntimeException 하위에서는 안 보일 수 있다.
		if(money < 0 | money > balance) {
			throw new Exception();
		}
		balance-=money;
	}
	//출력하기
	public void print() {
		System.out.println("계좌정보: "+account+" "+balance+" "+interestRate);
	}
}
