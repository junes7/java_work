package chap08;
//���ܰ� �߻��ϰų� �߻����� �ʰų� �ݵ�� ������ ��ɹ��� �ִ� ���?????
//finally���� �߰��ϰ� �����Ѵ�.
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.print("�迭�� ��� ������ �Է��ϼ���:");
			int size = key.nextInt();
			String[] arr = new String[size];
			System.out.println("step01");
			if(size>3) {
				arr[1] = new String("java");
			}
			System.out.println(arr[1].length());
		//e�� catch�Լ� �ȿ��� ����� ���������̱� ������ �ݺ��ؼ� ����� �����ϴ�.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ��Ҹ� �߸��׼���...");
		} catch(NullPointerException e) {
			System.out.println("���Դϴ�.");
		} catch(Exception e) {
			System.out.println("�����߻�!");
		//���� �������� ������ �����ؾ� �� ��ɹ��� ������ �����Ͽ� �����Ѵ�.
		} finally {
			System.out.println("�ݵ�� ������ ��ɹ� - ������ ����");
		}
	}
}
