package workbook_week6;

public class MobileTest {
	public static void main(String[] args) {
		//������ ����� ��ü ����
		Mobile[] mob = new Mobile[2];
		mob[0] = new Ltab("Ltab",500,"AP-01");
		mob[1] = new Otab("Otab",1000,"AND-20");
		//������ ��ü�� ���� ���
		Mobile.print();
		mob[0].print1();
		mob[1].print1();
		//������ Mobile ��ü�� 10�о� ����
		System.out.println("\n10�� ����");
		mob[0].charge(10);
		mob[1].charge(10);
		//10�� ���� �� ��ü ���� ���
		Mobile.print();
		mob[0].print1();
		mob[1].print1();
		//������ Mobile ��ü�� 5�о� ��ȭ
		System.out.println("\n5�� ��ȭ");
		mob[0].operate(5);
		mob[1].operate(5);
		//5�� ��ȭ �� ��ü ���� ���
		Mobile.print();
		mob[0].print1();
		mob[1].print1();

	}
}
