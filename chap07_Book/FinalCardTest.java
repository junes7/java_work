package chap07_Book;

class Card{
	//������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	//�����ڿ��� �� �� ���� �ʱ�ȭ �� �� �ִ�.
	final int NUMBER;
	final String KIND;
	//ī���� ���� ���̴� ������ �ʱ� ������ ����� ���� 
	static int width = 100;
	static int height = 200;
	//�ʱ�ȭ �޼ҵ� ����
	//�Ű������� ���� �޾ƿͼ� �ʱ�ȭ
	Card(String kind, int num)
	{
		KIND = kind;
		NUMBER = num;
	}
	//default ������ �ʱ�ȭ
	Card() {
		this("HEART", 1);
	}
	//Card Ŭ�������� �� ���ǵ� �������̵��ΰ���?
	public String toString() {
		return KIND+" "+NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("Heart",10);
		//c.NUMBER = 5;
		//The final field Card.NUMBER cannot be assigned
		//����μ� �����ڿ��� �� ���� �ʱ�ȭ �Ǿ��� ������
		//�� �̻� ������ �� ����.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
