import java.util.Scanner;
/* - ������ Scanner�� �Է�
   90 ~ 100: A
   80 ~ 89: B
   70 ~ 79: C
   60 ~ 69: D
   0 ~ 59: F
 0~100 ������ ���� �ƴ� ���� �ԷµǴ� ��� : �߸��Է� ����ϱ�*/
public class ScoreMultiIfExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score = key.nextInt();
		//���� ����
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
			System.out.println("�߸��Է�");
		}*/
		// ����� ���
		if(score>100 | score<0) {
			System.out.println("�߸��Է�");
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