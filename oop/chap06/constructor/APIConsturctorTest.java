package oop.chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API의 클래스에 정의된 생성자메소드 확인하기
public class APIConsturctorTest {
	public static void main(String[] args) throws Exception {
		//String에서 어떤 타입의 문자열을 조작할 것인지가 결정되어 있지
		//않기 때문에 생성자를 통하여 타입을 결정해주고 스트링 클래스를 생성해준다.
		String str = new String(); //String str = "";
		String str1 = new String("java");
		//string(byte[] bytes) 형태 사용
		byte[] data1 = {65,66,67,68,69};
		String str2 = new String(data1);
		//string(byte[] bytes, int offset, int length) 형태 사용
		//int offset : 시작위치, int length : 길이
		//즉 시작위치에서 몇개를 가지고 스트링을 구성할 것인지를 결정한다.
		//오버로딩처럼 클래스 이름은 동일하지만 매개변수로서 여러 데이터 타입을 쓸 수 있다는 것이 핵심!!
		//그러나 그 데이터 타입은 아무거나 쓸 수 없고 API 클래스 문서에 명시된 것만 쓸 수 있다.
		String str3 = new String(data1,2,3);
		//string(char[] value) 형태 사용
		char[] data2 = {'a','b','c','d','e'};
		String str4 = new String(data2);
		//System.out.println(str1);
		System.out.println(str1+"\tstr1길이:"+str1.length());
		System.out.println(str2+"\tstr2길이:"+str2.length());
		System.out.println(str3+"\tstr3길이:"+str3.length());
		System.out.println(str4+"\tstr4길이:"+str4.length());
		//File(string pathname)
		File f = new File("test.txt");
		System.out.println(f.getName());
		//FileInputStream(File file)
		FileInputStream fs = new FileInputStream("test.txt");
		//test.txt의 파일을 읽어들여 첫 글자를 출력해준다.
		System.out.println((char)fs.read());
	}

}
