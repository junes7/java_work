package workbook_week6;

public class Department {
	//클래스 멤버변수 선언
	private String name;
	private Evaluation evaluation;
	//기본 생성자 생성
	public Department() {
		
	}
	//6개의 클래스 변수를 입력 받는 생성자
	public Department(String name, double evaluationA, double evaluationB, double evaluationC, double evaluationD, double evaluationE) {
		this.name=name;
		//evaluation 클래스 변수 이용해 Evaluation 객체 생성 
		evaluation = new Evaluation(evaluationA,evaluationB,evaluationC,evaluationD,evaluationE);
	}
	//필요 메소드 생성
	public double evaluationNumber() {
		//지역변수 생성
		double result = 0.0;
		result = evaluation.evaluationNumber();
		return result;
	}
	//출력하기
	public void print() {
		System.out.print(name+"\t");
		evaluation.print();
	}
}
