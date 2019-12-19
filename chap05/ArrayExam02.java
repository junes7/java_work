package chap05;
//workbook 문제 8번(p15)
public class ArrayExam02 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0; //총합 저장할 변수
		int avg = 0; //평균 저장할 변수
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum="+sum);
		avg =sum/arr.length;
		System.out.println("avg="+avg);
		//System.out.println("avg="+(sum/arr.length));
	}

}
