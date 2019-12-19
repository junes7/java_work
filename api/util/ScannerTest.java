package api.util;

import java.util.Scanner;

// Scanner클래스(API)의 사용방법
// => 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공하는 클래스
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
/*		System.out.println("문자열을 입력하세요:");
		String data = key.next();
		System.out.println("키보드로 입력받은 문자열:"+data);*/
		System.out.print("숫자를 입력하세요:");
		int intVal = key.nextInt();
		System.out.println("입력받은 숫자=>"+intVal);
// console에 java program 입력하면 java만 출력된다. next()는 한 문자열만 출력하기 때문이다.
// println은 console에 치고 엔터 눌러야 한다. 그러나 print는 엔터 안 눌러도 된다.
// Scanner는 입력할 위치를 클릭하고 입력값을 주어야 오류가 나지 않는다.
// Scanner에서는 next()에서 쓸 문자열과 nextInt()에서 쓸 문자열을 space나 enter로 구분한다.
// 그래서 Scanner사용할 때 그 룰을 잘 따라주어야 한다.
// ex) (next()용)과자__123(nextInt()용)
	}
}