package workbook_week6;

public class Test01 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			if(5>num | num>10) {
				System.out.println("다시 입력하세요");
				return;
			}
			System.out.println("입력 값: "+num);
			Calc c = new Calc();
			System.out.println("결과: "+c.calculate(num));
		} catch (NumberFormatException e) {
			System.out.println("문자열을 입력하셨습니다. 다시 입력하세요");
			return;
		}
	}
}
