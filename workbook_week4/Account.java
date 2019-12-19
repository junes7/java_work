package workbook_week4;

public class Account {
	//클래스 멤버변수 선언
	private String account;
	private int balance;
	private double interestRate;
	//생성자 생성
	//기본 생성자 생성
	public Account() {
		
	}
	//매개변수로 값을 삽입하는 생성자 생성
	public Account(String account, int balance, double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	//setter와 getter 생성
	public void setAccount(String account) {
		this.account=account;
	}
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	//메소드 생성
	public double calculateInterest() {
		return balance*interestRate/100;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) {
		balance-=money;
	}
	//출력하기
	public void print() {
		System.out.println("계좌정보: "+account+" 현재잔액: "+balance);
	}
	public void accountInfo() {
		System.out.print("계좌정보: "+account+" 잔액: "+balance+"원 이자율: "+interestRate+"%");
	}
}
