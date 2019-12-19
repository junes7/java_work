package workbook_week6;

public class CalcTest {
	public static void main(String[] args) {
		int[] num = new int[2];
		//Calculator클래스 객체 선언
		Calculator cal = new Calculator();
		String str = " ";
		double result = 0.0;
		//eclipse argument를 통해 정수형 숫자, 연산 부호, 
		//정수형 숫자 3가지를 입력 받아 들인다.
		//arguments가 3개 미만, 3개 초과 일 경우 메시지 출력
		if (args.length < 3 | args.length > 3) {
			System.out.println("다시 입력 하세요");
			return;
		}
		num[0] = Integer.parseInt(args[0]);
		str = args[1];
		num[1] = Integer.parseInt(args[2]);
		if (str.equals("+")) {
			result = cal.plus(num[0], num[1]);
			System.out.println("결과: "+ result);
		} else if (str.equals("-")) {
			result = cal.minus(num[0], num[1]);
			System.out.println("결과: "+ result);
		} else if (str.equals("x")) {
			result = cal.multiplication(num[0], num[1]);
			System.out.println("결과: "+ result);
		} else if (str.equals("/")) {
			result = cal.divide(num[0], num[1]);
			System.out.println("결과: "+ result);
		} else {
			System.out.println("연산 기호 외 문자를 입력하셨습니다. 다시 입력해 주세요.");
		}
/*		} catch(NumberFormatException e) {
			System.out.println("문자열을 입력 하셨습니다. 다시 입력해 주세요.");
			return;
		} catch(ArithmeticException e) {
			System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
			System.out.println("결과: "+result);
			return;
		}*/
	}
}
