package chap09.api.lang;
//String클래스 사용방법 및 차이점
public class StringTest01 {
	public static void main(String[] args) {
		//String의 상수들이 저장되는 풀에 저장
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str1==str2) { //같다.
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		if(str1==str3) { //다르다.
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		if(str3==str4) { //다르다.
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		//String은 "문자열"의 형태로 정의될 수 있고
		//인스턴스의 형태로 정의될 수 있지만 문자열의 비교는 무조건 equals메소드를
		//이용해서 비교
		
		
	}

}
