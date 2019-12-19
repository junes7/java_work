package oop.chap07;

class FinalSuper {
	public void display() {
		System.out.println("super display");
	}
}
final class FinalSub  extends FinalSuper{ //final Ŭ������ ����� �Ұ����ϴ�.
	//���
	static final int NUM = 100;
	//�������̵� ���� - ���� ����
	@Override
	public void display() {
		System.out.println("display");
	}
	//final�޼ҵ�� �������̵� �� �� ����.
}
//@annotation�� �����Ϸ����� �������̵� �Ǿ��ٰ� �˷��ִ� ��ȣ�̴�.

public class FinalTest {
	public static void main(String[] args) {
		//�ڽ� ��ü ����
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000; //���� Ŭ���� ��������� final�� ���� ����̹Ƿ� ���� ������ �� ����.
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}
