package chap03;

import java.util.Random;

public class APIExam {

	public static void main(String[] args) {
		Random rand = new Random();
		// nextInt �޼ҵ� ȣ���ؼ� �������� ���
		int rnum = rand.nextInt();
		System.out.println("������ => "+rnum);
		// 1���� 100���� ������ ����ϱ�
		rnum = rand.nextInt(100)+1;
		System.out.println("������ => "+rnum);
	}
}