package workbook_week4;

public class Calc {
	//�������� ����
	int sum = 0;
	//calculate �޼ҵ� ����
	public int calculate(int data) {
		System.out.print("¦��: ");
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