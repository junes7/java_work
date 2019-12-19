package oop.chap06;
//PersonŬ������ ����ϴ� Ŭ����
//API class�� ���� ���� Ŭ������ new �����ڸ� �̿��� heap�� �÷����� ����Ѵ�.
//String�� ����(reference) Ÿ���̶� �迭 Ÿ��ó�� �ʱⰪ�� null�� ���´�.
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("�嵿��");
		p1.setAddr("�����");
		p1.setAge(45); // age������ private���� ����Ǿ� �����Ƿ�
					 // ���� ��Ű���� Ŭ���������� ������ �� ����.
		System.out.println("����:"+p1.getName());
		System.out.println("�ּ�:"+p1.getAddr());
		System.out.println("����:"+p1.getAge());
		// �Ʒ��� ���� heap�� Person�̶�� ��ü�� �� ������ �� �ִ�.
		Person p2 = new Person();
		p2.setName("�輭��");
		p2.setAddr("��õ��");
		p2.setAge(25);
		System.out.println("����:"+p2.getName());
		System.out.println("�ּ�:"+p2.getAddr());
		System.out.println("����:"+p2.getAge());
		
		Person p3 = new Person("�嵿��","�����",45);
		System.out.println("����:"+p3.getName());
		System.out.println("�ּ�:"+p3.getAddr());
		System.out.println("����:"+p3.getAge());
		Person p4 = new Person("�輭��","��õ��",45);
		System.out.println("����:"+p4.getName());
		System.out.println("�ּ�:"+p4.getAddr());
		System.out.println("����:"+p4.getAge());
	}
}
