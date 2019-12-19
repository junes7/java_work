package oop.chap07.poly;
//��ü�� ����ȯ - ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class Parent {
	String name = "�嵿��";
	public void display() {
		System.out.println("�θ��� display");
	}
}

class Child extends Parent {
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ�Ŭ������ display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		System.out.println("************************************");
		System.out.println("2. subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * ��ü�� ����ȯ
		 * -������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		 */
		System.out.println("************************************");
		System.out.println("3. superŸ���� ���������� sub��ü�� ����");
		Parent obj3= new Child(); //�ڵ�����ȯ
		obj3.display();
		//�޼ҵ�: �������̵��� �޼ҵ��� �������̵��� �޼ҵ尡 ȣ��
		System.out.println(obj3.name);
		//����: �������� Ÿ�Կ� �ش��ϴ� Ŭ������ ��������� ����
		//Ÿ���� ParentŸ�������� ������ ������ ��ü�� ChildŸ���̱� ������
		//ChildŸ������ ����ȯ�� �����ϴ�.(�����)
		((Child)obj3).test();
		System.out.println("************************************");
		System.out.println("4. subŸ���� ���������� super��ü�� ����-------x");
		//�ٲٷ��� �ϴ� ��ü�� �����̴�.
		//cannnot convert from Parent to Child
		//Child obj4= new Parent();
		System.out.println("************************************");
		System.out.println("5. subŸ���� �������� = "+"superŸ���� ��������(super ��ü�� ����)-------x");
		//����� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ���������
		//ĳ������ �Ϸ��� �� �� obj1�� child������ ���� ���� �����Ƿ� ĳ���� ���ܹ߻�
		//Exception in thread "main" java.lang.ClassCastException: oop.chap07.poly.Parent cannot be cast to oop.chap07.poly.Child
		//at oop.chap07.poly.RefCastingTest.main(RefCastingTest.java:54)
		//Child obj5 = (Child)obj1;
		System.out.println("************************************");
		System.out.println("6. subŸ���� �������� = "+"superŸ���� ��������(super ��ü�� ����)");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		Parent obj7 = obj2;
		//Parent obj7 = new Child();
		//superŸ�� = sub Ÿ��
		System.out.println("obj7:");
		System.out.println(obj7.name);
		obj7.display();
		
		Parent obj8 = null; //������ car����
		Child obj9 = new Child(); //fe
		Child obj10 = null; //fe2
		
		obj8 = obj9; //superŸ�� = subŸ��
		obj10 = (Child)obj8; //subŸ�� = superŸ�� -> By obj8 = obj9, subŸ��  = subŸ��  
	
		System.out.println(obj8.name);
		System.out.println(obj9.name);
		System.out.println(obj10.name);
		obj8.display();
		obj9.display();
		obj10.display();
		
		//������ ���°��� ���� ������ ������ �ȴ�.
		//obj10.test;
		//����(�ڽ�)�� ������(�θ�) �� �� null�� �����̸� ���� �׸��� �ٲٴ� ���� ������.
		//�׷��� obj10�� �� �����ε� ��ġ �����ϴ� ��ó�� �Ϸ��� �ϱ� ������ ��� �߻��Ѵ�.
		
		
	}
}
