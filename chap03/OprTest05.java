package chap03;
//삼항연산자, 대입연산자
public class OprTest05 {
	public static void main(String [] args) {
		int num1 = 80;
		System.out.println(num1>=90?"합격":"불합격");
		
		// 0~50까지는 A, 나머지는 B
		int num2 = 45;
		char result = num2<=50?'A':'B';
		System.out.println("결과=>"+num2);
		int i = 10;
		i = i+20;
		System.out.println("결과=>"+i);
		i+=30;
		System.out.println("결과=>"+i);
	}
}