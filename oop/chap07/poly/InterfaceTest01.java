package oop.chap07.poly;
/*
 * �������̽� ����
 * <<�������̽�>>
 * => �߻�޼ҵ�(����� ����)�� �����ϴ� Ư���� Ŭ����
 * 1. �������̽��� interfaceŰ���带 �̿��ؼ� ����
 * 2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 * 	-public abstract�� ��������
 * 	-����� ������ �ڵ����� �߰��ȴ�.
 * 3. �������̽��� �������̽��� ����� �� �ִ�. (extends�̿�)
 * 	-�����������̽��� �����������̽��� �߻�޼ҵ带 ��ӹ޴´�.
 * 4. Ŭ������ �������̽��� ����� �� �ִ�. (implements�̿�)
 * 	-�������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡
 * 	 extends�� ���� �����ϰ� implements�� �����ؾ� �Ѵ�.
 * 5. �������̽��� �������� ����� �� �ִ�. ��, ���߻���� �����ϴ�.
 * 	implements�ڿ��� �������̽��� ������ �� ,�� �����ؼ� ����
 * 6.Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵȴ�.
 * (��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� �ȴ�.)
 * 7.
 */
interface InterA {
	public abstract void test();
	void display(int num);
}
interface InterB extends InterA {
	void show();
}
interface InterC {
	
}
class SuperA {
	
}
// extends���� implements�� ���� ���� ������ ���.
// InterB�� ���� �ִ� �߻� �޼ҵ��� ��: InterA�� �޼ҵ� 2��  +  InterB�� �޼ҵ� 1��  = 3��
// �Ʒ��� ���� ��带 �����ϸ� subA�� ���� ������ �׾����µ� add unimplemented 
// methods�� ���� ���� �� �������̵� ���ش�.
//subA�� SuperA, InterA, InterB, InterC�� ���� Ŭ�����̴�.
class SubA extends SuperA implements InterB, InterC {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}


	
}
public class InterfaceTest01 {
	public static void main(String[] args) {
		//subA�� SuperA, InterA, InterB, InterC�� ���� Ŭ�����̴�.
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();

	}
}
