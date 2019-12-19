package chap04;

import java.util.Scanner;

// 숫자를 입력받아서 음수인지 양수인지 출력하기
// 단, 양수인 경우에는 짝수인지 홀수인지 출력하기, 0은 제외
// [출력형태]
// 음수인 경우
// ___는 음수입니다.
// 양수인 경우: 98입력
// 98은 짝수입니다.
// 97입력
// 97은 홀수입니다.
public class IfExam01 {
	public static void main(String [] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = key.nextInt();
		// 음수인 경우
		if(num < 0) {
			System.out.println(num+"는 음수입니다.");
		// 양수인 경우
		} else {
			if(num%2!=0) {
				System.out.println(num+"은 홀수입니다.");
			}
			else {
				System.out.println(num+"은 짝수입니다.");
			}
		}
	}
}