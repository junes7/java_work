package workbook_week4;

public class Test03 {
	public static void main(String[] args) {
		//������ ������ �Է�
		int num = Integer.parseInt(args[0]);
		//�������� ����
		int sum = 0;
		if(1<=num & num<=5) {
			for (int i=num; i<=10; i++) {
				if(i%3!=0 & i%5!=0) {
					System.out.print(i);
					sum+=i;			
				if(i>=8) {break;}
				System.out.print("+");
				}
			}
			System.out.println("\n���: "+sum);
		} else {
			System.out.println("�Է� ������ 1~5�����Դϴ�.");
			return;
		}
	}
}