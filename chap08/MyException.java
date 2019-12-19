package chap08;

import java.io.IOException;

//사용자 정의 Exception
public class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
	//MyException이 발생했을 때 저장하고 싶은 정보가 있거나 처리해야 할 내용이 있는경우 구현
	
}
