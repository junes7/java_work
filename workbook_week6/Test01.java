package workbook_week6;

public class Test01 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if(5>num | num>10) {
				System.out.println("�ٽ� �Է��ϼ���");
				return;
			}
			System.out.println("�Է� ��: "+num);
			Calc c = new Calc();
			System.out.println("���: "+c.calculate(num));
		} catch (NumberFormatException e) {
			System.out.println("���ڿ��� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			return;
		}
	}
}
