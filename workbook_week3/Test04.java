package workbook_week3;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0, count = 0;
		double avg = 0;
		Random rand = new Random();
		for(int i=0;i<arr3.length;i++) {
			// method1 random API 사용
			//int num = rand.nextInt(10)+1;
			//arr3[i] = num;
			// method2 Math.random() 메서드 사용
			arr3[i] = (int)(Math.random()*10+1);
			sum+=arr3[i];
			count++;
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+"\t");
		}
		System.out.println();
		avg = (double)sum/count;
		System.out.println("sum="+sum+",count"+count);
		System.out.println("avg="+avg);
	}
}