package workbook_week6;

public class Test03 {
	public static void main(String[] args) {
		String str = " "; //�μ��̸�
		double[] eval = new double[5];//5�� �μ� ������ ������ �迭 ����
		if(args.length<6 | args.length>6) {
			System.out.println("�ٽ� �Է� �ϼ���");
			return;
		}
		try {
			str = args[0];
			for (int i = 0; i < eval.length; i++) {
				eval[i] = Double.parseDouble(args[i+1]);
				if(eval[i]<10 | eval[i]>100) {
					System.out.println("�ٽ� �Է� �ϼ���");
					return;
				}
			}
			//departmentŬ���� ��ü ����
			Department dep = new Department(str,eval[0],eval[1],eval[2],eval[3],eval[4]);
			//�� ����ϱ�
			dep.print();
			System.out.println("�ݿ����� ������: "+dep.evaluationNumber());
		} catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է� �ϼ���");
		}
	}
}
