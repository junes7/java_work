package workbook_week6;

public class Calc {
	public int calculate(int data) {
		int sum = 0;
		for(int i=1; i<=data; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum; 
	}
}
