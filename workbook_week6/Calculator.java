package workbook_week6;

public class Calculator {
	// + ���� ó�� �� ���
	public double plus(int a, int b) {
		return a+b;
	}
	// - ���� ó�� �� ���
	public double minus(int a, int b) {
		return a-b;
	}
	// * ���� ó�� �� ���
	public double multiplication(int a, int b) {
		return (a*b);
	}
	// / ���� ó�� �� ���
	public double divide(int a, int b) {
		double result = 0.0;
			try {
				result = a/b;		
			} catch(Exception e) {
				System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
			}
		return result;
	}
}
