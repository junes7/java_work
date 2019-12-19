package test.exam;
public class SecondExam{
	public static void main(String [] args){
		int num1 = 200;
		int num2 = 100;
		// 덧셈 연산
		int result = num1 + num2;
		System.out.println("num1 => "+num1);
		System.out.println("num2 => "+num2);
		System.out.println("+연산결과 => "+result);
		// 한 줄 주석문 (설명문) - 실행되지 않는 명령문
		// result는 변수이므로 값을 변경할 수 있다.
		// 뺄샘 연산
		result = num1 - num2;
		System.out.println("-연산결과 => "+result);
		// 곱셈 연산
		result = num1 * num2;
		System.out.println("*연산결과 => "+result);
		// 나눗셈 연산
		num2 = 30;
		result = num1 / num2;
		System.out.println("/연산결과 => "+result);
		// 나머지 연산
		result = num1 % num2;
		System.out.println("%연산결과 => "+result);
	}
}