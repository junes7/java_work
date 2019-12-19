package test.exam;
public class OprTest01
{
	public static void main(String [] args)
	{
		int x = 5;
		int y = x++;
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		x = 5;
		y = ++x;
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		x = 5;
		y = x--;
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		x = 5;
		y = --x;
		System.out.println("y = "+y);
		System.out.println("x = "+x);
	}
}