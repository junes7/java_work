package chap04;

public class ForExam03 {
	public static void main(String[] args) {
		int sum=0, oddsum=0, evensum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%2==0) {
				evensum+=i;
			} else if(i%2!=0) {
				oddsum+=i;
			}
		}
		System.out.println("����:"+sum);
		System.out.println("Ȧ����:"+oddsum);
		System.out.println("¦����:"+evensum);
	}
}