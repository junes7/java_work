package test.exam;
public class TypeCastingTest {
	public static void main(String [] args) {
		// �⺻������ ����ȯ
		//- �ڵ�����ȯ(ū ������Ÿ���� ���� = ���� ������Ÿ�� ����)
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);

		char c = 'a';
		System.out.println(c);
		// A�� ascii���� ����ϰ� ���� ���
		int data = c; // int = char : �ڵ�����ȯ
		System.out.println(data);

		// ����� ����ȯ
		// �⺻������ ����� ����ȯ
		byte bytedata = (byte)200;
		System.out.println(bytedata);

		int intdata = 111;
		// int�����͸� char�� ��ȯ�ϴ� ���
		char chardata = (char)intdata;
		System.out.println(chardata);
		//115�� char�� �����ĳ����
		System.out.println((char)115);
		// int�� doube�� ��ȯ�� �� ĳ���� �ϵ��� ����.
		double doubledata = (double)20/100*100;
		System.out.println(doubledata);
	}
}
