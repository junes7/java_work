package chap05;
//workbook ���� 8��(p15)
public class ArrayExam02 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0; //���� ������ ����
		int avg = 0; //��� ������ ����
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum="+sum);
		avg =sum/arr.length;
		System.out.println("avg="+avg);
		//System.out.println("avg="+(sum/arr.length));
	}

}
