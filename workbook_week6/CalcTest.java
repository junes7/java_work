package workbook_week6;

public class CalcTest {
	public static void main(String[] args) {
		int[] num = new int[2];
		//CalculatorŬ���� ��ü ����
		Calculator cal = new Calculator();
		String str = " ";
		double result = 0.0;
		//eclipse argument�� ���� ������ ����, ���� ��ȣ, 
		//������ ���� 3������ �Է� �޾� ���δ�.
		//arguments�� 3�� �̸�, 3�� �ʰ� �� ��� �޽��� ���
		if (args.length < 3 | args.length > 3) {
			System.out.println("�ٽ� �Է� �ϼ���");
			return;
		}
		num[0] = Integer.parseInt(args[0]);
		str = args[1];
		num[1] = Integer.parseInt(args[2]);
		if (str.equals("+")) {
			result = cal.plus(num[0], num[1]);
			System.out.println("���: "+ result);
		} else if (str.equals("-")) {
			result = cal.minus(num[0], num[1]);
			System.out.println("���: "+ result);
		} else if (str.equals("x")) {
			result = cal.multiplication(num[0], num[1]);
			System.out.println("���: "+ result);
		} else if (str.equals("/")) {
			result = cal.divide(num[0], num[1]);
			System.out.println("���: "+ result);
		} else {
			System.out.println("���� ��ȣ �� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
		}
/*		} catch(NumberFormatException e) {
			System.out.println("���ڿ��� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
			return;
		} catch(ArithmeticException e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
			System.out.println("���: "+result);
			return;
		}*/
	}
}
