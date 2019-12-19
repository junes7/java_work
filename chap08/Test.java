package chap08;

public class Test {
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		int num = obj.test(100,0);
		System.out.println("결과!!!!!!!"+num);
		
		ThrowsTest02 obj2 = new ThrowsTest02();
		int num2=0;
		int inputNum = 100; //외부에서 입력받을 값
		try {
			num2 = obj2.test(inputNum,0); //오류발생 가능성이 있는 코드
		} catch(ArithmeticException e) {
			//짝수면 100000 홀수면 0
			if(inputNum%2==0) {
				num2 = 100000;
			} else {
				num2 = 0;
			}
		}
		System.out.println("결과!!!!!!!"+num2);

	}

}
