package test.exam;
// �ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ��ǥ���� ����
public class PrimitiveTypeTest {
	public static void main(String [] args) {
		boolean bool = true; // true or false
		System.out.println(bool);

		// ������
		char c = 'a'; // charŸ�� ������ ���ͷ��� ǥ���Ҷ� ''�� ǥ��
		System.out.println(c);
		// ����������
		// ������������ �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127; // byte = int ������ ��ġ�� ������ byte�϶� 
					  //int literal�� ���� �� ����.
		System.out.println(b);
		short s = 32767; // short = int
		System.out.println(s);
		int i = 2147483647; // int = int
		System.out.println(i);
		long l = 2147483648L;  // longŸ���� ��쿡�� ���̻� L�� l�� 
		System.out.println(l); //�߰��Ѵ�.
		// �Ǽ���
		// �Ǽ��� ���ͷ��� �⺻ Ÿ���� double
		double f = 10.5; // float = double
		// �����ſ� ū�Ÿ� �ְ� �ֱ� ������ ������ ����.
		// float Ÿ���� ��� ���̻� F�� f�� �߰��Ѵ�.
		System.out.println(f);
		double d= 10.5;
		System.out.println(d);
		// double exam = 10/3.0;
		double exam = (double) 10/3;
		System.out.println(exam);
	}
}