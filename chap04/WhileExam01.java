package chap04;
//ForExam03�� for���� while�� �ٲٱ�

public class WhileExam01 {
	public static void main(String[] args) {
		int i=1, sum=0, oddsum=0, evensum=0;
		while(i<=100) {
			sum+=i;
			if(i%2==0) {
				evensum+=i;
			} else {
				oddsum+=i;
			}
			i++;
		}
		System.out.println("��:"+sum);
		System.out.println("Ȧ����:"+oddsum);
		System.out.println("¦����:"+evensum);
	}
}