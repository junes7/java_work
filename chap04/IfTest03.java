package chap04;

import java.util.Scanner;
//��øif�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {
	public static void main(String[] args) {
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		//90�̸��̸� "�����"�� ����ϼ���.
		Scanner key = new Scanner(System.in);
		System.out.print("��������: ");
		int score = key.nextInt();
		System.out.print("����Ƚ��: ");
		int count = key.nextInt();
		// count�� 3���� ������ �����, count�� 3���� ũ�� ó������ �ٽ� ����
		if(score>=90)
		{
			System.out.println("���");
		} else {
			//System.out.println("�����");
			if(count>=3) {
				System.out.println("ó������ �ٽ� ����...");
			} else {
				System.out.println("�� ���� �����...");
			}
		}
	}
}