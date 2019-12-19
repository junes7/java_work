package workbook_week4;

public class Calc {
	//지역변수 선언
	int sum = 0;
	//calculate 메소드 선언
	public int calculate(int data) {
		System.out.print("짝수: ");
		for (int i = 1; i <=data; i++) {		
			if(i%2==0) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println();
		return sum;
	}
}