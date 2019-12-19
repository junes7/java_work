package workbook_week6;

public class AccountTest {
	public static void main(String[] args) {
		//account ��ü ����
		Account acc = new Account("441-0290-1203",500000.0,7.3);
		//account�� �⺻ ���� ���
		acc.print();
		System.out.println("��������: "+acc.getAccount()+" "+acc.getBalance()+" "+acc.getInterestRate());
		//account�� -10�� �Ա� - Exception ó��
		try {
			acc.deposit(-10);
		} catch(Exception e) {
			System.out.println("�Ա� �ݾ��� 0���� �۽��ϴ�.");
		}
		//account�� 600000�� ��� - Exception ó��
		try {
			acc.withdraw(600000);
		} catch(Exception e) {
			System.out.println("��� �ݾ��� 0���� �۰ų� ���� �ܾ׺��� �����ϴ�.");
		}
		//���� ��� - ���� �ܰ� �������� ������ �� ���� �ݾ��� ����Ѵ�.
		System.out.println("����: "+acc.calculateInterest());		
	}
}
