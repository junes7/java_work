package workbook_week5;

public class Company {
	// Ŭ���� ������� ����
	private double salary;					//�⺻��
	private double annualIncome;			//��ҵ�
	private double afterTaxAnnualIncome;	//���� ���� �� ��ҵ��� ��
	private double bonus;					//���ʽ�
	private double afterTaxBonus;			//���� ���� �� �� ���ʽ��� ��
	// ������ ����
	public Company() {
		
	}
	
	public Company(double salary) {
		this.salary = salary;
	}
	public double getIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}
	public double getAfterTaxIncome() {
		afterTaxAnnualIncome = getIncome()*0.9;
		//������ ���� �������� �׻� ��ҵ� ���� ����ϰ� ���� ���� ����� 
		//�ϸ���� ������ ���� ������ getIncome()�� �� �־�� �Ѵ�.
		return afterTaxAnnualIncome;
	}
	public double getBonus() {
		bonus = (salary*0.2)*4;
		return bonus;
	}
	public double getAfterTaxBonus() {
		afterTaxBonus = getBonus()*0.945;
		return afterTaxBonus;
	}
}
