package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//API의 메소드를 호출하는 경우
//1. API의 메소드를 사용할 때 선언부에 throws가 추가되어 있으면 반드시 try~catch로
//처리해야 한다.
//2. RuntimeException의 하위 Exception을 throws하는 경우에는
//문법적으로 Exception에 대한 처리를 하도록 제한하지 않는다.
//=>문법으로 제한하지는 않지만 Exception을 throws하고 있으면 처리를 해야한다.

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("test.txt");
			System.out.println(fs.read());
			System.out.println(Integer.parseInt("1234"));
			System.out.println(Integer.parseInt("문자열"));
			//API에서 Exception을 throws하고 있으면 처리를 해야한다. 
			//근데 예외 처리를 해주지 않은 것에 대한 경고를 주고 있다.
			//그러므로 아래와 같이 예외 처리를 해준다.
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			//파일을 다시 선택할 수 있도록 처리
		} catch(IOException e) {
			System.out.println("파일을 읽을 때 오류가 발생했습니다.");
		}
		
	}
}
