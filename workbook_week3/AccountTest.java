package workbook_week3;

public class AccountTest {
	public static void main(String[] args) {
		// account ��ü ����
		Account account = new Account("441-0290-1203",500000,7.3);
		// account �⺻ ���� �Է�
/*		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);*/
		// account �⺻ ���� ���
		account.print();
		// account �� 20000�� �Ա�
		account.deposit(20000);
		// account ���� ���� ���
		account.print();
		// ���� ��� - ���� �ܰ� �������� ������ �� ���� �ݾ��� ����Ѵ�.
		account.print1();
	}
}
