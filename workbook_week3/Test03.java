package workbook_week3;

public class Test03 {
	public static void main(String[] args) {
		int[][] arr2 = {
			{5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20},
			{30, 30, 30, 30}
		};
		int sum = 0, count = 0;
		double avg = 0;
		for(int row=0;row<arr2.length;row++) {
			for(int i=0;i<arr2[row].length;i++) {
				System.out.print(arr2[row][i]+"\t");
				sum+=arr2[row][i];
				count++;
			}
			System.out.println();
		}
		System.out.println("sum="+sum);
		avg=(double)sum/count;
		System.out.println("avg="+avg);
	}
}
