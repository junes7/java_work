package chap04;
//ForExam03의 for문을 while로 바꾸기

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
		System.out.println("합:"+sum);
		System.out.println("홀수합:"+oddsum);
		System.out.println("짝수합:"+evensum);
	}
}