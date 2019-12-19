package oop.chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		// account number, owner name, balance
		System.out.print("카드번호입력:");
		String cardNo = key.next();
		acc1.pay(500000,"1234-5678-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());
		// 위는 지불이 되지 않기 때문에 잔금이 그대로이고
		acc1.pay(500000,"1234-5647-8888");
		System.out.println("현재잔액====>"+acc1.getBalance());
		// 이 위는 지불이 되었기 때문에 잔액이 남아있게 된다.
		
	}

}
