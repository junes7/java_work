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
		//this.cardNo == cardNo 이거는 주소값과 주소값을 비교하기 때문에 에러가 난다.
		//문자열 비교는 무조건 equals()를 이용해서 비교한다.
		//== X안돼!!
		if(this.cardNo.equals(cardNo) & super.getBalance() >= amount) {
			//super.setBalance(super.getBalance()-amount);
			//지불가능한 조건
			//상위클래스에 정의된 withdraw메소드를 마치 자신의 것처럼 가져다 쓸 수 있다.
			System.out.println("지불이 가능합니다.");
			withdraw(amount);
		} else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
