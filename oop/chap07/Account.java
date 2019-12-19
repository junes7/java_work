package oop.chap07;

public class Account {
	private String accId;
	private int balance;
	private String ownerName;
	// ������ ����
	public Account() {
		
	}	
	public Account(String accId, int balance, String ownerName) {
		//super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	// setter�� getter ����
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		balance-=amount;
	}
}
