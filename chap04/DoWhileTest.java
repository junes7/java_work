package chap04;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num=0;
		while(num>10) {
			System.out.print("�����Է�:");
			num = key.nextInt();
			//while���� ������ �������� ������ ������ �ڵ尡 ������� �ʴ´�.
			System.out.println("while�� - �����ɹ�:"+num);
			num++;
		}
		num=10;
		//������ �� �� �����ϰ� �� �ڿ� ���ǹ��� üũ�Ͽ� ���ǹ��� �����ϴ� ������
		//��� ������ �� �ִ�.
		//������ �� �� �����Ͽ� üũ�ؾ� �� �� ����Ѵ�. 
		do {
			System.out.print("�����Է�:");
			num = key.nextInt();
			System.out.println("do_while�� - �����ɹ�:"+num);
			// num++;
		}while(num>10);
	}
}