package oop.chap06;
//Ŭ������ ��ǥ�ϴ� ������ ���ݱ����� main �Լ� �ȿ� ���ǵǾ���.
//Ŭ���� Ư���� ��Ÿ���� ������: ������� or �ʵ�
//��������� ���� Ư���� ��Ȳ�� �ƴ϶�� �ʱⰪ�� ���� �ʴ´�.
//������ Ÿ���� ������, �⺻�� ��� �� �� �ִ�.
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// -��������� �����Ҷ��� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// -�ʱⰪ�� �������� �ʾƵ� �������� null, ������ 0, �Ǽ��� 0.0, boolean false�̴�.
// -��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
// -��� �Ǵ� Ŭ������ �ܺο��� �������� ���ϵ��� �����ϴ� ������ �Ѵ�.
// -���� �����ڰ� ���� �� �ִ� �� -> Ŭ����, �������, �޼���, ������
// -public		���� ������ ���� ����. �ƹ� �������� ���� �����ϴ�.
// -protected	���� ��Ű�� ������, �׸��� �ٸ� ��Ű���� �ڼ�Ŭ�������� ������ �����ϴ�.
// -default 	���� ��Ű�� �������� ������ �����ϴ�.
// -private 	���� Ŭ���� �������� ������ �����ϴ�.
// �����ϴ� ���: �޼��带 ����� ����ϴ� ���
// Ŭ������ ������ �� ��������� private�� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ�
// public �޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�. 
public class Person {
	private String name;// Ŭ������ Ư���� ��Ÿ���� ������ - ������� or �ʵ�(API���� ���� ���)
	private String addr;
	private int age;
	public Person() {
		System.out.println("�⺻ ������");
	}
	public Person(String name)
	{
		System.out.println("�Ű����� 1�� ������");
		this.name = name;
	}
	public Person(String name, String addr)
	{
		this(name);
		System.out.println("�Ű����� 2�� ������");
		this.addr = addr;		
	}
	public Person(String name, String addr, int age) {
		this(name, addr);
		System.out.println("�Ű����� 3�� ������");
		this.age=age;
	}
	// ��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ��
	// ���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
	// �̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	// name������ ���� �����ϴ� �޼ҵ�
	// �޼ҵ��: set + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	//		   setName
	// set�޼ҵ�� ���� Ÿ���� void�̴�. ����: ���� �ٲ��ִ�(setting)���Ҹ� �Ѵ�. 
	// �׷��� ���� �����ϰ� ���� ������ ��Ұ� ���� ������
	// name = name �̷��� ����ϸ� ��� ���.
	// this.������� = ���� �Ű�����
	public void setName(String name) { //setter�޼ҵ� : ���� �����ϱ� ���� ���� �Ű������� ������ ��������� ������ �� ���� �޼ҵ� 
		this.name = name;
	}
	//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
	//�޼ҵ��: get + ���������(ù ���ڸ� �빮�� �ٲ�)
	//get�� �Ű������� ���� ���� ���� �ִ�.
	//		  getName
	//������ ã�ƺ��� ������ ���� ����� ���� name������ ã�´�.
	//��� this.name��� name�� ���־ �ȴ�.
	public String getName() // getter�޼ҵ� : ���� ������ ����� �� ���� �޼ҵ�
	{
		return this.name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
/*	String name;// Ŭ������ Ư���� ��Ÿ���� ������ - ������� or �ʵ�(API���� ���� ���)
	String addr;
	int age;*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
}