package workbook_week4;

public class AccountTest {
	public static void main(String[] args) {
		Account account;
		//account ��ü ����
		account = new Account("441-0290-1203",500000,7.3);
		//account �⺻ ���� ���
		account.print();
		//account�� 20000�� �Ա�
		account.deposit(20000);
		//account ���� ���� ���
		account.print();
		//���� ��� - ���� �ܰ� �������� ������ �� ���� �ݾ��� ����Ѵ�.
		System.out.println("����:" +account.calculateInterest());
	}
}