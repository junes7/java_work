package chap05;
//2�����迭 �ۼ� ����
public class Array2DTest01 {
	public static void main(String[] args) {
		//2�����迭�� ����� ����
		int[][] myarr = new int[2][3];
		//2�����迭�� �ʱ�ȭ
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		//myarr[2][2]=300; Exception ���� �߻�
		System.out.println("myarr�� 2��° ��Ұ� �����ϴ� �迭�� 0�� ����� ��:"
		+myarr[1][0]);
		System.out.println("myarr�� 1��° ��Ұ� �����ϴ� �迭�� 0�� ����� ��:"
		+myarr[0][0]);
		//������ �迭�� ����� ����
		System.out.println("�迭�� ����=>"+myarr.length);
		System.out.println("myarr�� 0�� ��Ұ� �����ϴ� �迭�� ����� ����:"
		+myarr[0].length);
		System.out.println("myarr�� 1�� ��Ұ� �����ϴ� �迭�� ����� ����:"
		+myarr[1].length);
		//��ü �迭�� ��Ҹ� �������ϱ� - length�� ���� ���� �����ϱ�
		for(int outer=0;outer<2;outer++) {
			for(int i=0;i<3;i++) {
				System.out.print(myarr[outer][i]+"\t");
			}
			System.out.println();
		}
		//��ü �迭�� ��Ҹ� �������ϱ� - �迭�� length������ �̿��ؼ� �����ϱ�
		for(int outer=0;outer<myarr.length;outer++) {
			for(int i=0;i<myarr[outer].length;i++) {
				System.out.print(myarr[outer][i]+"\t");
			}
			System.out.println();
		}
	}
}
