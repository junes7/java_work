package workbook_week6;

public class Department {
	//Ŭ���� ������� ����
	private String name;
	private Evaluation evaluation;
	//�⺻ ������ ����
	public Department() {
		
	}
	//6���� Ŭ���� ������ �Է� �޴� ������
	public Department(String name, double evaluationA, double evaluationB, double evaluationC, double evaluationD, double evaluationE) {
		this.name=name;
		//evaluation Ŭ���� ���� �̿��� Evaluation ��ü ���� 
		evaluation = new Evaluation(evaluationA,evaluationB,evaluationC,evaluationD,evaluationE);
	}
	//�ʿ� �޼ҵ� ����
	public double evaluationNumber() {
		//�������� ����
		double result = 0.0;
		result = evaluation.evaluationNumber();
		return result;
	}
	//����ϱ�
	public void print() {
		System.out.print(name+"\t");
		evaluation.print();
	}
}
