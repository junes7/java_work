package oop.chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","�嵿��"
					,1000000,"1234-5647-8888");
		// account number, owner name, balance
		System.out.print("ī���ȣ�Է�:");
		String cardNo = key.next();
		acc1.pay(500000,"1234-5678-8888");
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		// ���� ������ ���� �ʱ� ������ �ܱ��� �״���̰�
		acc1.pay(500000,"1234-5647-8888");
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		// �� ���� ������ �Ǿ��� ������ �ܾ��� �����ְ� �ȴ�.
		
	}

}
