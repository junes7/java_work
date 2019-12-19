package chap04;

import java.util.Scanner;
//중첩if문 - if문 안에 if문 정의하고 사용하기(모든 제어문은 중첩할 수 있다.)
public class IfTest03 {
	public static void main(String[] args) {
		//Scanner로 점수를 입력 받아 90점 이상이면 "통과"를 출력하고
		//90미만이면 "재시험"을 출력하세요.
		Scanner key = new Scanner(System.in);
		System.out.print("시험점수: ");
		int score = key.nextInt();
		System.out.print("응시횟수: ");
		int count = key.nextInt();
		// count가 3보다 작으면 재시험, count가 3보다 크면 처음부터 다시 시작
		if(score>=90)
		{
			System.out.println("통과");
		} else {
			//System.out.println("재시험");
			if(count>=3) {
				System.out.println("처음부터 다시 시작...");
			} else {
				System.out.println("이 과목만 재시험...");
			}
		}
	}
}