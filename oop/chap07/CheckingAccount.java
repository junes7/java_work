package oop.chap07;

public class CheckingAccount extends Account {
	private String cardNo;
	public CheckingAccount(String accId, String ownerName, int balance, String cardNo) {
		super(accId,balance,ownerName);
		this.cardNo=cardNo;
	}
	public CheckingAccount() {
		
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public void pay(int amount, String cardNo) {
		//this.cardNo == cardNo �̰Ŵ� �ּҰ��� �ּҰ��� ���ϱ� ������ ������ ����.
		//���ڿ� �񱳴� ������ equals()�� �̿��ؼ� ���Ѵ�.
		//== X�ȵ�!!
		if(this.cardNo.equals(cardNo) & super.getBalance() >= amount) {
			//super.setBalance(super.getBalance()-amount);
			//���Ұ����� ����
			//����Ŭ������ ���ǵ� withdraw�޼ҵ带 ��ġ �ڽ��� ��ó�� ������ �� �� �ִ�.
			System.out.println("������ �����մϴ�.");
			withdraw(amount);
		} else {
			System.out.println("������ �Ұ����մϴ�.");
		}
	}
}
