package chap04;

import java.util.Scanner;
// => ScoreMultiExam�� switch������ ����
//  
public class ScoreSwitchExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score = key.nextInt();
		//���� ����
		if(score>100 | score<0) {
			System.out.println("�߸��Է�");
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
