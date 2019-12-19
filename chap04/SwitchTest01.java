package chap04;

import java.util.Scanner;

//switch연습 - 기본문법(MultiIfTest 클래스의 내용을 switch로 변경)
//switch는 if~else if문을 대신할 수 있는 제어문
public class SwitchTest01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요: ");
		int ssn = key.nextInt(); // 7번째 숫자 입력 1,2,3,4
		switch(ssn) {
		// true | false를 판단할 수 있는 조건이 아니라 평가할 값이
		// 저장된 변수, 연산식, 메소드 호출
		case 1: //ssn변수에 저장된 값을 case문으로 평가 - 비교연산자 사용불가
			System.out.println("남자");
			break; //break문을 만나면 switch문을 빠져나간다.
		case 2:
			System.out.println("여자");
			break;
		case 3:
			System.out.println("남자");
			break;
		case 4:
			System.out.println("여자");
			break;
		default: //if문의 else와 같은 역할
			System.out.println("기타");
		}
	}
}
