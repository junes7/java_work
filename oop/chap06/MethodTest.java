package oop.chap06;
//�޼ҵ��� �Ű������� ����Ÿ������ ������, �迭, �⺻�� ��� ����� �� �ִ�.
public class MethodTest {
	public static void main(String[] args) {
		Person p = new Person("�嵿��","����",45);
		display(p.getName(), p.getAddr(), p.getAge());
		display(p); //Person��ü�� �Ű������� ������ �� �ִ�.
		
	}
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	public static void display(Person p) {
		System.out.println(p.toString());
		//p�� ��ü�� �ּҰ� �����ִ� ������ ����ϴ� �޼ҵ�
	}
	//�޼ҵ带 ������ �� �� ���� ���� ������ �� �ִµ�
	//������ Ÿ���� �����͸� ���� �� �����ؾ� �Ѵٸ� 
	//�迭�� ����Ÿ������ �����ϰ� ����� �� �ִ�.
	public static int[] getJumsu() {
		int[] myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		return myarr;
	}
	//Ÿ���� �ٸ� ���� ���� �����͸� �����ϰ� ���� ���
	//�迭�� ������ �� �����Ƿ� �����ϰ� ���� ���� ���� �ִ� ��ü�� �����ؼ� �����Ѵ�.
	
	public static Student getInfo() {
		//Student�� ��� ������ ����
		return new Student("�嵿��",90,100,50,78);
	}
}