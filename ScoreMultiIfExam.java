import java.util.Scanner;
/* - 점수를 Scanner로 입력
   90 ~ 100: A
   80 ~ 89: B
   70 ~ 79: C
   60 ~ 69: D
   0 ~ 59: F
 0~100 사이의 값이 아닌 값이 입력되는 경우 : 잘못입력 출력하기*/
public class ScoreMultiIfExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = key.nextInt();
		//점수 구별
/*		if(90<=score && score<=100) {
			System.out.println("A");
		} else if(80<=score && score<=89) {
			System.out.println("B");
		} else if(70<=score && score<=79) {
			System.out.println("C");
		} else if(60<=score && score<=69) {
			System.out.println("D");
		} else if(0<=score && score<=59) {
			System.out.println("F");
		} else {
			System.out.println("잘못입력");
		}*/
		// 강사님 방법
		if(score>100 | score<0) {
			System.out.println("잘못입력");
		} else {
			if(score>=90){
				System.out.println("A");
			} else if(score>=80) {
				System.out.println("B");
			} else if(score>=70) {
				System.out.println("C");
			} else if(score>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}