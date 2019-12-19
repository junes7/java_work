package chap04;

import java.util.Scanner;

// -성별과 나이를 입력 받아서 다음과 같이 출력하기
// 입력값 : 1,3은 남자 2,4는 여자
//	나이 - 1~19 : 청소년
//			20 : 성인
// [출력형태]
// 성별 3과 나이 20을 입력한 경우: 성인남자
// 성별 4와 14를 입력한 경우: 청소년여자
// if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력하는 예제
// ctrl+shift+f => 코드를 보기 쉽게 탭 정리
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("성별:");
		int gender = key.nextInt();
		if(gender < 1 && gender > 4) {
			System.out.println("숫자를 잘못입력");
		} else {
			System.out.print("나이를 입력하세요:");
			int age = key.nextInt();
			if(gender==1 || gender==3) {
				if(age>=1 && age<=19) {
					System.out.println("청소년남자");
				}
				else {
					System.out.println("성인남자");
				}
			} else {
				if(age>=1 && age<=19) {
					System.out.println("청소년여자");
				}
				else {
					System.out.println("성인여자");
				}				
			}
		}
	}
}