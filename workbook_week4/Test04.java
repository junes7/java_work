package workbook_week4;

public class Test04 {
	public static void main(String[] args) {
		//2���� �迭 �׸� ����
		int[][] num = new int[2][2];
		//�Է� �� ���� �׸� ����
		int[]input = new int[2];
		//�Է� ���� �����Ͱ� 2�� �̸� �Ǵ� 2�� �ʰ��� �޽��� ���
		if(args.length>2 || args.length<2) {
			System.out.println("�ٽ� �Է� �ϼ���");
			return;
		}
		//������ �Է� �� 1~5�̿��� ���ڰ� �Էµ� ��쳪 ���ڿ� �Է� �� �޽��� ���
			try {
				for(int k=0; k<input.length; k++) {
					input[k] = Integer.parseInt(args[k]);
					if(1>input[k] | input[k]>5) {
						System.out.println("���ڸ� Ȯ�� �ϼ���");
						return;
					}
				}
			} catch(NumberFormatException e) {
				System.out.println("���ڿ��� �Է��߽��ϴ�. �ٽ� �Է� �ϼ���");
				return;
			}
		//�������� ����
		int count = 0;
		double sum = 0.0;
		//�迭�� ������ �Է� �� ���
		for(int row=0; row<num.length; row++) {
			for(int i=0; i<num[row].length; i++) {
					num[row][i] = input[row];
					sum+=num[row][i];
					count++;
					System.out.print(num[row][i]+" ");
			}
			System.out.println();
		}
		//�迭�� ���հ� ��� ���
		System.out.println("\nsum="+sum);
		System.out.println("avg="+sum/count);
	}
}