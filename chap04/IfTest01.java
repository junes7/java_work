package chap04;

import java.util.Random;
// if���� RandomŬ���� ����
public class IfTest01 {

	public static void main(String[] args) {
		// Random�� nextInt�� �̿��ؼ� 1���� 100������ ���� �߻���Ų �� �۾�
		Random rand = new Random();
		int rnum = rand.nextInt(100)+1;
		System.out.println("num => "+rnum);
		if(rnum>=90) {
			System.out.println("����");
			System.out.println("�� ��° ����");
		}
		System.out.println("����");
	}
}