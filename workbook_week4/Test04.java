package workbook_week4;

public class Test04 {
	public static void main(String[] args) {
		//2차원 배열 그릇 선언
		int[][] num = new int[2][2];
		//입력 값 받을 그릇 선언
		int[]input = new int[2];
		//입력 받은 데이터가 2개 미만 또는 2개 초과시 메시지 출력
		if(args.length>2 || args.length<2) {
			System.out.println("다시 입력 하세요");
			return;
		}
		//데이터 입력 및 1~5이외의 숫자가 입력될 경우나 문자열 입력 시 메시지 출력
			try {
				for(int k=0; k<input.length; k++) {
					input[k] = Integer.parseInt(args[k]);
					if(1>input[k] | input[k]>5) {
						System.out.println("숫자를 확인 하세요");
						return;
					}
				}
			} catch(NumberFormatException e) {
				System.out.println("문자열을 입력했습니다. 다시 입력 하세요");
				return;
			}
		//지역변수 선언
		int count = 0;
		double sum = 0.0;
		//배열에 데이터 입력 및 출력
		for(int row=0; row<num.length; row++) {
			for(int i=0; i<num[row].length; i++) {
					num[row][i] = input[row];
					sum+=num[row][i];
					count++;
					System.out.print(num[row][i]+" ");
			}
			System.out.println();
		}
		//배열의 총합과 평균 출력
		System.out.println("\nsum="+sum);
		System.out.println("avg="+sum/count);
	}
}