package chap04;

import java.util.Scanner;

// -������ ���̸� �Է� �޾Ƽ� ������ ���� ����ϱ�
// �Է°� : 1,3�� ���� 2,4�� ����
//	���� - 1~19 : û�ҳ�
//			20 : ����
// [�������]
// ���� 3�� ���� 20�� �Է��� ���: ���γ���
// ���� 4�� 14�� �Է��� ���: û�ҳ⿩��
// if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ����ϴ� ����
// ctrl+shift+f => �ڵ带 ���� ���� �� ����
public class IfExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("����:");
		int gender = key.nextInt();
		if(gender < 1 && gender > 4) {
			System.out.println("���ڸ� �߸��Է�");
		} else {
			System.out.print("���̸� �Է��ϼ���:");
			int age = key.nextInt();
			if(gender==1 || gender==3) {
				if(age>=1 && age<=19) {
					System.out.println("û�ҳⳲ��");
				}
				else {
					System.out.println("���γ���");
				}
			} else {
				if(age>=1 && age<=19) {
					System.out.println("û�ҳ⿩��");
				}
				else {
					System.out.println("���ο���");
				}				
			}
		}
	}
}