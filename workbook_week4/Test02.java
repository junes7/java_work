package workbook_week4;

public class Test02 {
	public static void main(String[] args) {

		//Calc 객체 생성
		Calc c = new Calc();
		//정수형 데이터 입력
		int num = Integer.parseInt(args[0]);
		if(5<=num && num<=10) {
			System.out.println("결과: "+c.calculate(num));
		} else {
			System.out.println("입력 범위는 5~10까지입니다.");
			return;
		}
	}
}
