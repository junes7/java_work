package workbook_week3;

public class Test02 {
	public static void main(String[] args) {
		int total = 0;
		double average = 0;
		int[][] arr2 = {
			{5,5,5,5,5},	
			{10,10,10,10,10},	
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int count=0;
		for(int row=0;row<arr2.length;row++) {
			for(int i=0;i<arr2[row].length;i++) {
				total+=arr2[row][i];
				count++;
			}
		}
		System.out.println("total="+total+",count="+count);
		//average = total/count; �̷��� �� ������ �ּ��� ��� ���� �Ǽ� ���·� ���´�.
		average = (double)total/count;
		System.out.println("average="+average);
	}
}