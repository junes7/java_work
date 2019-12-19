package chap08;

public class Account {
	//Ŭ���� ���� ����
	private String account;
	private double balance;
	private double interestRate;
	//Constructor����
	//�⺻ ������ ����
	public Account() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Account(String account, double balance, double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	//getter/setter ����
	//�ܰ�� �������� ���� �� �ֱ⿡ �������ش�.
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
	//�ʿ� �޼ҵ� ����
	public double calculateInterest() {
		//���ڰ��
		return balance*interestRate/100;
	}
	public void deposit(double money) throws Exception {
		//�Ա� ó�� �� ���ܻ�Ȳ ó��
		if(money < 0) {
			throw new Exception("�Ա� �ݾ��� 0���� �۽��ϴ�.");
		}
		balance+=money;
	}
	public void withdraw(double money) throws Exception {
		//��� ó�� �� ���ܻ�Ȳ ó��
		//throw new exception���� �� �� ���� ������ ���̴� ���� �ƴϴ�.
		//RuntimeException ���������� �� ���� �� �ִ�.
		if(money < 0 | money > balance) {
			throw new Exception();
		}
		balance-=money;
	}
	//����ϱ�
	public void print() {
		System.out.println("��������: "+account+" "+balance+" "+interestRate);
	}
}
