package workbook_week4;

public class Test02 {
	public static void main(String[] args) {

		//Calc ��ü ����
		Calc c = new Calc();
		//������ ������ �Է�
		int num = Integer.parseInt(args[0]);
		if(5<=num && num<=10) {
			System.out.println("���: "+c.calculate(num));
		} else {
			System.out.println("�Է� ������ 5~10�����Դϴ�.");
			return;
		}
	}
}
