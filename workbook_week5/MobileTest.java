package workbook_week5;

public class MobileTest {
	public static void main(String[] args) {
		//������ Mobile ��ü ����
		Ltab l1 = new Ltab("Ltab",500,"AP-01");
		Otab o1 = new Otab("Otab",1000,"AND-20"); 
		//������ ��ü�� ���� ���
		l1.print();
		l1.print1();
		o1.print1();
		//������ Mobile��ü�� 10�о� ����
		l1.charge(10);
		o1.charge(10);
		//10�� ���� �� ��ü ���� ���
		System.out.println("10�� ����");
		l1.print();
		l1.print1();
		o1.print1();
		//������ Mobile��ü�� 5�о� ��ȭ
		l1.operate(5);
		o1.operate(5);
		//5�� ��ȭ �� ��ü ���� ���
		System.out.println("5�� ��ȭ");
		l1.print();
		l1.print1();
		o1.print1();		
	}
}