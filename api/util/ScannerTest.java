package api.util;

import java.util.Scanner;

// ScannerŬ����(API)�� �����
// => ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� �����ϴ� Ŭ����
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
/*		System.out.println("���ڿ��� �Է��ϼ���:");
		String data = key.next();
		System.out.println("Ű����� �Է¹��� ���ڿ�:"+data);*/
		System.out.print("���ڸ� �Է��ϼ���:");
		int intVal = key.nextInt();
		System.out.println("�Է¹��� ����=>"+intVal);
// console�� java program �Է��ϸ� java�� ��µȴ�. next()�� �� ���ڿ��� ����ϱ� �����̴�.
// println�� console�� ġ�� ���� ������ �Ѵ�. �׷��� print�� ���� �� ������ �ȴ�.
// Scanner�� �Է��� ��ġ�� Ŭ���ϰ� �Է°��� �־�� ������ ���� �ʴ´�.
// Scanner������ next()���� �� ���ڿ��� nextInt()���� �� ���ڿ��� space�� enter�� �����Ѵ�.
// �׷��� Scanner����� �� �� ���� �� �����־�� �Ѵ�.
// ex) (next()��)����__123(nextInt()��)
	}
}