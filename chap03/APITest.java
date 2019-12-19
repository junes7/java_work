package chap03; //chap03폴더를 생성하고 이 안에 APITest.class를 저장한다.

import java.io.File;
import java.util.Random;
//Ctrl+shift+o 를 눌러 자동 import
//import java.io.*;//java.lang패키지만 기본으로 인식하므로
//다른 패키지의 존재하는 클래스를 사용하는 경우 어떤 패키지에 있는지
//인식시키는 작업을 해야한다.
//import java.util.*; // Random 클래스만 인식시키기
// API 사용하기 - 참조형 변수 선언 
public class APITest {

	public static void main(String[] args) {
		// 클래스를 메모리에 올리려면 new를 선언해 주어야 한다.
		// 1. API에서 제공하는 클래스를 자바 프로그램 안에서 사용하기 위해 메모리에
		// 올리는 작업이다.
		// java.lang은 JVM에 있는 기본 패키지라서 바로 인식한다.
		// 사용할 클래스명 변수 = new 사용할클래스명()
		// ------------
		// 여기서 사용할 클래스명은 데이터 타입으로 사용된다.
		String str = new String();
		StringBuffer sb = new StringBuffer();
		// 그러나 나머지 곳에 있는 클래스는 import 클래스 이름을 통해 가져와 주어야 한다.
		// constructed 에러가 나는 경우 '폴더의 경로'를 주어야 한다.
		File file = new File("test.txt");
		Random rand = new Random();
		//ArrayList list = new ArrayList();
		
		// 2. 객체(클래스를 사용하기 위해 메모리에 올려 놓은 것)의 메소드 사용하기 
		//-> 인스턴스라고도 함
		// charAt의 실행 결과가 char타입이므로 같은 타입의 변수를 선언해서 저장
		String str2 = new String("java programming");
		char returnVal = str2.charAt(2);
		System.out.println("실행결과=>"+returnVal);
		
		//i love you라는 문자열을 이용해서 String객체를 생성하고
		//이 문자열의 길이를 다음과 같은 형식으로 출력하세요
		//[출력형태]
		//문자열의 길이 => _____
		String str3 = new String("i love you");
		// length()는 이 스트링(문자열)의 길이를 반환한다.
		int len = str3.length();
		System.out.println("문자열의 길이 => "+len);
	}
}
