package chap09.api.lang;
//String클래스의 기본 메소드와 String클래스의 특징
//=> 문자열처리 메소드를 자주 호출하거나 +연산자로 문자열을 연결하는 작업이 많은 경우
// String을 사용하지 않고 StringBuffer or StringBuilder를 사용한다.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		//원본변환 관련 메소드들은 다른 String객체를 만들때 원본 스트링을 읽어들어서 작업한다.
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("원본데이터:"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		System.out.println("str1.substring(2)=>"+str1.substring(2));
		System.out.println("str1.substring(2,8)=>"+str1.substring(2,8));
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));
		System.out.println("원본데이터:"+str1);
		//ex) 원본변환 String 5개 만들었을 때
		//-> 원본 string 5개가 할당된다.
		//따라서 문자열 조작이 빈번한 곳에서는 String 데이터 타입을 쓰지 않는다.
		//-> memory buffer overflow가 일어날 수 있으므로
		//이럴 때 Stringbuffer나 Stringbuilder를 사용한다.
		//Stringbuffer처리(동시접속에 대한 고려)가 잘  되어있다.
		//Stringbuilder처리(동시접속에 대한 고려)가 잘 안 되어있다.
	}
}