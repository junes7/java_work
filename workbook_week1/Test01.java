package workbook_week1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		long ID = key.nextLong();
		System.out.println("나의 주민번호: "+ID);
	}
}