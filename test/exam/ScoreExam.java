package test.exam;
public class ScoreExam {
	public static void main(String [] args){
		int kor = 80;
		int math = 90;
		int eng = 70;
		int total = kor + math + eng;
		float avg = total/3;

		System.out.println("ÃÑÁ¡ => "+total);
		System.out.println("Æò±Õ => "+avg);
	}
}