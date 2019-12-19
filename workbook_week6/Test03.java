package workbook_week6;

public class Test03 {
	public static void main(String[] args) {
		String str = " "; //부서이름
		double[] eval = new double[5];//5개 부서 평가점수 저장할 배열 선언
		if(args.length<6 | args.length>6) {
			System.out.println("다시 입력 하세요");
			return;
		}
		try {
			str = args[0];
			for (int i = 0; i < eval.length; i++) {
				eval[i] = Double.parseDouble(args[i+1]);
				if(eval[i]<10 | eval[i]>100) {
					System.out.println("다시 입력 하세요");
					return;
				}
			}
			//department클래스 객체 선언
			Department dep = new Department(str,eval[0],eval[1],eval[2],eval[3],eval[4]);
			//값 출력하기
			dep.print();
			System.out.println("금용사업부 평가점수: "+dep.evaluationNumber());
		} catch(NumberFormatException e) {
			System.out.println("문자를 입력하셨습니다. 다시 입력 하세요");
		}
	}
}
