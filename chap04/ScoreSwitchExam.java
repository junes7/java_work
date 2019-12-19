package chap04;

import java.util.Scanner;
// => ScoreMultiExam을 switch문으로 변경
//  
public class ScoreSwitchExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = key.nextInt();
		//점수 구분
		if(score>100 | score<0) {
			System.out.println("잘못입력");
		} else {
			switch(score/10) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
					break;			
			}
		}
	}
}
