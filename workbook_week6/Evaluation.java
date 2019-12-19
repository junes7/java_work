package workbook_week6;

public class Evaluation {
	//클래스 멤버변수 선언
	private double evaluationA;
	private double evaluationB;
	private double evaluationC;
	private double evaluationD;
	private double evaluationE;
	//기본 생성자 생성
	public Evaluation() {
		
	}
	//5개의 클래스 변수를 입력받는 생성자 생성
	public Evaluation(double evaluationA, double evaluationB, double evaluationC, double evaluationD, double evaluationE) {
		this.evaluationA=evaluationA;
		this.evaluationB=evaluationB;
		this.evaluationC=evaluationC;
		this.evaluationD=evaluationD;
		this.evaluationE=evaluationE;
	}
	//필요 메소드 생성
	public double evaluationNumber() {
		//지역변수 생성
		double result = 0.0;
		result = (evaluationA+evaluationB)/2*0.55;
		result += (evaluationC+evaluationD)/2*0.25;
		result += evaluationE*0.2;
		return result;
	}
	//출력하기
	public void print() {
		System.out.println(evaluationA+"\t"+evaluationB+"\t"+evaluationC+"\t"+evaluationD+"\t"+evaluationE);
	}
}
