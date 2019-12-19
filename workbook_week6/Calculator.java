package workbook_week6;

public class Calculator {
	// + 연산 처리 및 출력
	public double plus(int a, int b) {
		return a+b;
	}
	// - 연산 처리 및 출력
	public double minus(int a, int b) {
		return a-b;
	}
	// * 연산 처리 및 출력
	public double multiplication(int a, int b) {
		return (a*b);
	}
	// / 연산 처리 및 출력
	public double divide(int a, int b) {
		double result = 0.0;
			try {
				result = a/b;		
			} catch(Exception e) {
				System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
			}
		return result;
	}
}
