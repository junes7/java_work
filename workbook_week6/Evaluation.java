package workbook_week6;

public class Evaluation {
	//Ŭ���� ������� ����
	private double evaluationA;
	private double evaluationB;
	private double evaluationC;
	private double evaluationD;
	private double evaluationE;
	//�⺻ ������ ����
	public Evaluation() {
		
	}
	//5���� Ŭ���� ������ �Է¹޴� ������ ����
	public Evaluation(double evaluationA, double evaluationB, double evaluationC, double evaluationD, double evaluationE) {
		this.evaluationA=evaluationA;
		this.evaluationB=evaluationB;
		this.evaluationC=evaluationC;
		this.evaluationD=evaluationD;
		this.evaluationE=evaluationE;
	}
	//�ʿ� �޼ҵ� ����
	public double evaluationNumber() {
		//�������� ����
		double result = 0.0;
		result = (evaluationA+evaluationB)/2*0.55;
		result += (evaluationC+evaluationD)/2*0.25;
		result += evaluationE*0.2;
		return result;
	}
	//����ϱ�
	public void print() {
		System.out.println(evaluationA+"\t"+evaluationB+"\t"+evaluationC+"\t"+evaluationD+"\t"+evaluationE);
	}
}
