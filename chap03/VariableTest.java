package chap03;
// 기본형과 참조형 변수의 비교작업
public class VariableTest {
	public static void main(String[] args) {
		// 기본형변수
		int i = 10;
		int j = 10;
		System.out.println("==========기본형==========");
		if(i==j) {
			System.out.println("기본형 같다.");
		} else {
			System.out.println("기본형 다르다.");
		}
		// 참조형변수
		String str1 = new String("java");
		String str2 = new String("java");
		// heap에 할당된 각 스트링 클래스 주소값이 다르기 때문에 '참조형다르다'라는 결과가 나온다.
		if(str1==str2) {
			System.out.println("참조형같다.");
		} else {
			System.out.println("참조형다르다.");
		}
		// str1변수에 heap에 할당된 str2의 주소값을 대입한다.
		// str1과 str2가 같은 주소값을 가지고 있기에 '참조형같다'라는 결과가 나온다.
		//str1=str2;
		if(str1==str2) {
			System.out.println("참조형같다.");
		} else {
			System.out.println("참조형다르다.");
		}
		//문자열비교 - String클래스 메소드로 처리, equals()로 쓴다.
		//boolean result = str1.equals(str2);
		//if(result==true) {
		//if(result) {
		if(str1.equals(str2)) {
			System.out.println("문자열같다.");
		} else {
			System.out.println("문자열다르다.");
		}
	}
}