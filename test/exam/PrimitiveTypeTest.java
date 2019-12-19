package test.exam;
// 자바 기본형 데이터의 리터럴에 대해서 살표보는 예제
public class PrimitiveTypeTest {
	public static void main(String [] args) {
		boolean bool = true; // true or false
		System.out.println(bool);

		// 문자형
		char c = 'a'; // char타입 변수는 리터럴을 표현할때 ''로 표현
		System.out.println(c);
		// 정수형변수
		// 정수형변수에 기본으로 할당되는 리터럴의 타입은 int
		byte b = 127; // byte = int 범위가 넘치지 않으면 byte일때 
					  //int literal을 넣을 수 없다.
		System.out.println(b);
		short s = 32767; // short = int
		System.out.println(s);
		int i = 2147483647; // int = int
		System.out.println(i);
		long l = 2147483648L;  // long타입인 경우에는 접미사 L과 l을 
		System.out.println(l); //추가한다.
		// 실수형
		// 실수형 리터럴의 기본 타입은 double
		double f = 10.5; // float = double
		// 작은거에 큰거를 넣고 있기 때문에 에러가 난다.
		// float 타입인 경우 접미사 F나 f를 추가한다.
		System.out.println(f);
		double d= 10.5;
		System.out.println(d);
		// double exam = 10/3.0;
		double exam = (double) 10/3;
		System.out.println(exam);
	}
}