package chap09.api.lang;
//String객체를 다른 타입의 데이터로 변환
public class StringTest04 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle servlet jsp spring");
		//1. String -> byte[]
		byte[] data1 = str1.getBytes();
		for (int i = 0; i < data1.length; i++) {
			System.out.print(data1[i]+"\t");
		}
		System.out.println();
		//2. String -> char[]
		char[] data2 =  str1.toCharArray();
		for (int i = 0; i < data2.length; i++) {
			System.out.print(data2[i]+"\t");
		}
		System.out.println();
		//3. String -> String[]
		String[] data3 = str2.split(" ");
		/*for (int i = 0; i < data3.length; i++) {*/
		for (String string : data3) {
			System.out.print(string+"\t");
		}
		System.out.println();
		//4. 기본형 -> String
		//java->lang->String->valueOf
		int i = 1000;
		double d = 10.0;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		test(i+""); //정수 숫자를 문자열화 시켰다.
		test(d+""); //실수 숫자를 문자열화 시켰다.
	}
	public static void test(String data) {
		System.out.println("전달된 데이터=>"+data);
	}
}
