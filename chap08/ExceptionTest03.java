package chap08;

import java.util.InputMismatchException;
import java.util.Scanner;
//여러 개의 예외가 발생하는 경우 처리
//사용자가 입력하는 값에 따라 예외가 다르게 발생한다.
// 1. 사용자가 제대로 값을 입력: 예외가 발생되지 않으므로 catch 블럭은 실행되지 않는다.
// 2. 사용자가 나눌 숫자에 0을 입력
//		=> ArithmeticException이 발생
//		=> Exception e = new ArithmeticException();
//		   ------------		-----------------------
//			상위타입				하위객체
// 3. 사용자가 숫자가 아니라 문자를 입력
//		=> InputMismatchException발생
//		=> Exception e = new InputMismatchException();
//	- 다양한 Exception의 처리를 위해서 catch블럭을 여러 개 정의하고 사용할 수 있다.
//	- 상위 타입에 속하는 Exception은 가장 나중에 정의해야 한다.
public class ExceptionTest03 {
	public static void main(String[] args) {
		//try~~catch 구문은 switch 구문이랑 비슷하다. 그래서 위에서부터 아래로 처리된다.
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.print("숫자를 입력하세요:");
			int num1 = key.nextInt();
			System.out.print("나눌 숫자를 입력하세요:");
			int num2 = key.nextInt();
			System.out.println("결과:"+(num1/num2));
		} catch(InputMismatchException e) {
			System.out.println("문자를 입력할 수 없습니다.");
		} catch(ArithmeticException e) {
			System.out.println("나눌 숫자에 0을 입력할 수 없습니다.");
		} catch(Exception e) { //모든 예외클래스의 상위클래스
			System.out.println("예외발생");
			System.out.println("예외메시지:"+e.getMessage());
			e.printStackTrace();
		}
	}
}
