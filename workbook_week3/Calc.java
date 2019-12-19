package workbook_week3;

public class Calc {
	// 절대로 아래처럼 매개변수를 선언하면 안 된다.
	public int calcSum(int a, int b, int c, int d) {
		int sum = 0;
		sum = a+b+c+d;
		return sum;
	}
}
