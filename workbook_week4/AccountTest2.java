package workbook_week4;

public class AccountTest2 {
	public static void main(String[] args) {
		//5���� Account�� ��ü �迭 ����
		Account[] acc = new Account[5];
		//for���� �̿��Ͽ� Account ��ü�� �迭�� ����
		for (int i = 0; i < acc.length; i++) {
			acc[i] = new Account("221-0101-211"+(i+1),100000,4.5);
		}
		//for���� �̿��Ͽ� Account ���� ���
		for (int j = 0; j < acc.length; j++) {
			acc[j].accountInfo();
			System.out.println();
		}
		System.out.println();
		//for���� �̿��Ͽ� �������� �����ϰ� ���ڸ� ȭ�鿡 ���
		for (int k = 0; k < acc.length; k++) {
			acc[k].setInterestRate(3.7);
			acc[k].accountInfo();
			System.out.println(" ����: "+acc[k].calculateInterest()+"��");
		}
	}
}
