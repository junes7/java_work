package chap03;

public class OprTest01 {
	public static void main(String [] args) {
		int x;
		int y;
		x = 5;
		y = x++;
		System.out.println("x의 값=>"+x);
		System.out.println("y의 값=>"+y);
		System.out.println("======================");
		x = 5;
		y = ++x;
		System.out.println("x의 값=>"+x);
		System.out.println("y의 값=>"+y);
		System.out.println("======================");
		x = 5;
		y = x--;
		System.out.println("x의 값=>"+x);
		System.out.println("y의 값=>"+y);
		System.out.println("======================");
		x = 5;
		y = --x;
		System.out.println("x의 값=>"+x);
		System.out.println("y의 값=>"+y);
		System.out.println("======================");
	}
}