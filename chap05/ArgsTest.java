package chap05;

public class ArgsTest {
	public static void main(String[] args) {
		/*
		 * args = new String[2]
		 * 					------
		 * 					명령행 매개변수의 갯수만큼 설정
		 * args[0] = "100"
		 * args[1] = "200"
		 */
		//명령행 매개변수 2개를 입력 받겠다는 의미이다.
		System.out.println("명령행매개변수->"+args[0]);
		System.out.println("명령행매개변수->"+args[1]);
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		//String으로 입력받은 명령행 매개변수를 int로 변환
		int num1 = Integer.parseInt(args[0]);// int =String x
		int num2 = Integer.parseInt(args[1]);
		System.out.println("합=>"+(num1+num2));
	}
}
