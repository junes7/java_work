package workbook_week4;

public class AccountTest2 {
	public static void main(String[] args) {
		//5개의 Account형 객체 배열 선언
		Account[] acc = new Account[5];
		//for문을 이용하여 Account 객체를 배열에 생성
		for (int i = 0; i < acc.length; i++) {
			acc[i] = new Account("221-0101-211"+(i+1),100000,4.5);
		}
		//for문을 이용하여 Account 정보 출력
		for (int j = 0; j < acc.length; j++) {
			acc[j].accountInfo();
			System.out.println();
		}
		System.out.println();
		//for문을 이용하여 이자율을 변경하고 이자를 화면에 출력
		for (int k = 0; k < acc.length; k++) {
			acc[k].setInterestRate(3.7);
			acc[k].accountInfo();
			System.out.println(" 이자: "+acc[k].calculateInterest()+"원");
		}
	}
}
