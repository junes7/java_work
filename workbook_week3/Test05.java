package workbook_week3;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("ù��° ����=>"+args[0]);
		System.out.println("�ι�° ����=>"+args[1]);
		System.out.println("����° ����=>"+args[2]);
		System.out.println("�׹�° ����=>"+args[3]);
		int sum = 0;
		double avg = 0;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		
		Calc calc = new Calc();
		sum = calc.calcSum(a, b, c, d);
		//args�� �迭�̶� �迭�� ���� ����� args.length�� ���� �����ϴ�.
		avg = (double)sum/args.length;
		if(avg<0 | avg>100) {
			System.out.println("wrong input");
		} else {
			switch((int)avg/10) {
				case 10:
				case 9:
					System.out.println("A����");
					break;
				case 8:
				case 7:
					System.out.println("B����");
					break;
				case 6:
				case 5:
					System.out.println("C����");
					break;
				case 4:
				case 3:
					System.out.println("D����");
					break;
				default:
					System.out.println("F����");
			}
		}
	}
}