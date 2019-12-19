package workbook_week4;

public class Test03 {
	public static void main(String[] args) {
		//정수형 데이터 입력
		int num = Integer.parseInt(args[0]);
		//지역변수 선언
		int sum = 0;
		if(1<=num & num<=5) {
			for (int i=num; i<=10; i++) {
				if(i%3!=0 & i%5!=0) {
					System.out.print(i);
					sum+=i;			
				if(i>=8) {break;}
				System.out.print("+");
				}
			}
			System.out.println("\n결과: "+sum);
		} else {
			System.out.println("입력 범위는 1~5까지입니다.");
			return;
		}
	}
}