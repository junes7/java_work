package chap05;
//2���� �迭�� ����� ����
public class Array2DTest02 {
	public static void main(String[] args) {
		//2���� �迭���� �迭�� �����ϴ� �迭�� ��Ҹ� ���� �ٸ��� ������ �� �ִ�.
		int[][] myarr = new int[3][];
		myarr[0] = new int[3];
		myarr[1] = new int[2];
		myarr[2] = new int[1];
		for(int outer=0;outer<myarr.length;outer++) {
			for(int i=0;i<myarr[outer].length;i++) {
				System.out.print(myarr[outer][i]+"\t");
			}
			System.out.println();
		}
	}
}