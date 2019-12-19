package chap04;

import java.util.Scanner;

public class ForExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("출력할 단"
				+ ": ");
		int i = key.nextInt();
		for(int j=1; j<10; j++) {
			System.out.println(i+"*"+j+" = "+i*j);
		}
	}
}