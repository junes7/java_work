package workbook_week5;

public class Test02 {
	public static void main(String[] args) {
		//company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ�
		//�ڵ� casting�ȴ�.
		int salary = Integer.parseInt(args[0]);
		Company com = new Company(salary);
		System.out.println("�� �⺻�� ��: "+com.getIncome()+" ����: "+com.getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+com.getBonus()+" ����: "+com.getAfterTaxBonus());
		System.out.println("�� ���޾� ��: "+(com.getAfterTaxIncome()+com.getAfterTaxBonus()));
	}
}