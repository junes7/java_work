package chap03;
// �񱳿�����
public class OprTest02 {
	public static void main(String [] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		//num1 ������ +������ ������
		//���� ���ڿ��� ������ �޾Ƽ� ���ڿ�ȭ �Ǿ��� ������ �����߻�
		//- �񱳿���, ��Ģ���� ���� �� �� ����.
		System.out.println("���� ���==>"+(num1+num2));
		System.out.println("num1>num2==>"+(num1>num2));
		System.out.println("num1>=num2==>"+(num1>=num2));
		System.out.println("num1<num2==>"+(num1<num2));
		System.out.println("num1<=num2==>"+(num1<=num2));
		
		System.out.println("num1==num3==>"+(num1==num3));
		System.out.println("num2==num3==>"+(num2==num3));
		System.out.println("num1!=num3==>"+(num1!=num3));
	}
}
