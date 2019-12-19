package workbook_week3;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	// ������ ����
	public Account() {
		
	}
	public Account(String account, int balance, double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	// setter�� getter ����
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double CalculateInterest() {
		return balance*interestRate/100;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) {
		balance-=money;
	}
	//����ϱ�
	public void print() {
		System.out.println("��������:"+account+" �����ܾ�:"+balance);
	}
	public void print1() {
		double interest = CalculateInterest();
		System.out.println("����:"+interest);
	}
}
