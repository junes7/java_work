package workbook_week5;

public class Company {
	// 클래스 멤버변수 생성
	private double salary;					//기본급
	private double annualIncome;			//년소득
	private double afterTaxAnnualIncome;	//세금 공제 후 년소득의 합
	private double bonus;					//보너스
	private double afterTaxBonus;			//세금 공제 후 년 보너스의 합
	// 생성자 정의
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
		//지금은 값이 나오지만 항상 년소득 부터 계산하고 세금 공제 계산을 
		//하리라는 보장이 없기 때문에 getIncome()을 써 주어야 한다.
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
