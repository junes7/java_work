package chap03;
//���׿�����, ���Կ�����
public class OprTest05 {
	public static void main(String [] args) {
		int num1 = 80;
		System.out.println(num1>=90?"�հ�":"���հ�");
		
		// 0~50������ A, �������� B
		int num2 = 45;
		char result = num2<=50?'A':'B';
		System.out.println("���=>"+num2);
		int i = 10;
		i = i+20;
		System.out.println("���=>"+i);
		i+=30;
		System.out.println("���=>"+i);
	}
}