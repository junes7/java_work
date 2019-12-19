package chap08;
//예외가 발생하거나 발생하지 않거나 반드시 실행할 명령문이 있는 경우?????
//finally블럭을 추가하고 정의한다.
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.print("배열의 요소 갯수를 입력하세요:");
			int size = key.nextInt();
			String[] arr = new String[size];
			System.out.println("step01");
			if(size>3) {
				arr[1] = new String("java");
			}
			System.out.println(arr[1].length());
		//e는 catch함수 안에서 선언된 지역변수이기 때문에 반복해서 사용이 가능하다.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 요소를 잘못액세스...");
		} catch(NullPointerException e) {
			System.out.println("널입니다.");
		} catch(Exception e) {
			System.out.println("오류발생!");
		//제일 마지막에 무조건 실행해야 될 명령문이 있을때 정의하여 실행한다.
		} finally {
			System.out.println("반드시 실행할 명령문 - 무조건 실행");
		}
	}
}
