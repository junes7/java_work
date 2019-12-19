package workbook_week3;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("첫번째 점수=>"+args[0]);
		System.out.println("두번째 점수=>"+args[1]);
		System.out.println("세번째 점수=>"+args[2]);
		System.out.println("네번째 점수=>"+args[3]);
		int sum = 0;
		double avg = 0;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		
		Calc calc = new Calc();
		sum = calc.calcSum(a, b, c, d);
		//args도 배열이라서 배열의 길이 출력이 args.length를 통해 가능하다.
		avg = (double)sum/args.length;
		if(avg<0 | avg>100) {
			System.out.println("wrong input");
		} else {
			switch((int)avg/10) {
				case 10:
				case 9:
					System.out.println("A학점");
					break;
				case 8:
				case 7:
					System.out.println("B학점");
					break;
				case 6:
				case 5:
					System.out.println("C학점");
					break;
				case 4:
				case 3:
					System.out.println("D학점");
					break;
				default:
					System.out.println("F학점");
			}
		}
	}
}