package workbook_week4;

public class Account {
	//Ŭ���� ������� ����
	private String account;
	private int balance;
	private double interestRate;
	//������ ����
	//�⺻ ������ ����
	public Account() {
		
	}
	//�Ű������� ���� �����ϴ� ������ ����
	public Account(String account, int balance, double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	//setter�� getter ����
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
	//�޼ҵ� ����
	public double calculateInterest() {
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
		System.out.println("��������: "+account+" �����ܾ�: "+balance);
	}
	public void accountInfo() {
		System.out.print("��������: "+account+" �ܾ�: "+balance+"�� ������: "+interestRate+"%");
	}
}
