package chap03_Prac;
// 3-7
public class prac06 {
	public static void main(String [] args) {
		int fahrenheit = 100;
		// 데이터 타입은 괄호 안에 같이 묶어 주어야 한다.
		float celcius = ((float)5/9*(fahrenheit-32));
		System.out.println("Fahrenheit: "+fahrenheit);
		System.out.println("Celcius: "+celcius);
	}
}
