package chap04;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num=0;
		while(num>10) {
			System.out.print("숫자입력:");
			num = key.nextInt();
			//while문은 조건을 만족하지 않으면 블럭안의 코드가 실행되지 않는다.
			System.out.println("while문 - 실행명령문:"+num);
			num++;
		}
		num=10;
		//무조건 한 번 실행하고 그 뒤에 조건문을 체크하여 조건문을 만족하는 동안은
		//계속 실행할 수 있다.
		//무조건 한 번 실행하여 체크해야 할 때 사용한다. 
		do {
			System.out.print("숫자입력:");
			num = key.nextInt();
			System.out.println("do_while문 - 실행명령문:"+num);
			// num++;
		}while(num>10);
	}
}