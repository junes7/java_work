package chap05;
/*
 * -int�� �迭 �ۼ�
 * -����� ����: 10
 * - 2��		3��		5�� ���(index)��
 *   100	200		300 ���� �ʱ�ȭ
 * - ��� ����� �� ����ϱ�
 */
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] myarr = new int[10];
		myarr[2] = 100;
		myarr[3] = 200;
		myarr[5] = 300;
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
	}
}