package chap05;
//�迭 �׼����ϱ�
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] myarr = new int[50];
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		System.out.println("�迭�� ����� ����:"+myarr.length);
		System.out.println("=======================");
		//�迭�� ����� ũ�⸦ ���
		//�迭�� length - �迭�� ����� �����ϰ� �ִ� �⺻ ����(�ڵ����� �����Ǵ�)
		System.out.println("�迭�� ����� ����:"+myarr.length);
		for(int i=0;i<myarr.length;i++) {
			myarr[i]+=i;
			System.out.println(myarr[i]);
		}
	}
}