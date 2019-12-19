package chap08;
//try~~~catch로 예외를 처리할 수 있다.
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println("******프로그램 시작******");
			System.out.println(10/0);//예외가 발생할 수 있는 문장
			System.out.println("******프로그램 종료******");
		} catch(ArithmeticException e) {
			System.out.println("오류발생....");
			//e.getMessage가 에러메시지를 넘겨주는 메소드이다.
			System.out.println("예외메시지:"+e.getMessage());
			e.printStackTrace();//void
			//에러를 추적하는 메소드; 몇번째 줄에서 에러가 발생 하였는지 추적하여 알려준다.
		}
	}
}
