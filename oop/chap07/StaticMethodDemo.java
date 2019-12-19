package oop.chap07;
//static�޼ҵ�
// - static����� �����ϱ� ���� �뵵
// -��ƿ��Ƽó�� ����ϱ� ���� �뵵
public class StaticMethodDemo {
	public static void staticTest1() {
		//1. static�޼ҵ忡�� static �޼ҵ� �����ϱ� - �Ϲ����� ��� ����
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display() {
		//2. non-static�޼ҵ忡�� non-static�޼ҵ� ȣ�� - �Ϲ����� ��� ����
		show();
		System.out.println("display()");
	}
	public static void staticTest2() {
		System.out.println("staticTest2");
	}
	public void show() {
		//3. non-static�޼ҵ忡�� static�޼ҵ� ȣ�� - �Ϲ����� ������� ȣ�� ����
		staticTest2();
		System.out.println("show()");
	}

	public static void staticTest3() {
		//4. static�޼ҵ忡�� non-static�޼ҵ� ȣ���ϱ� - 
		//->non-static �޼ҵ尡 �޸𸮿� ���� ������ ���� Ŭ��������
		//���ǵ� �޼ҵ��� �ϴ��� ������ ��ü���� �Ŀ� ȣ���ؾ� �Ѵ�.
		//1.�޸𸮿� �÷�����
		StaticMethodDemo obj = new StaticMethodDemo(); 
		//2.�޸𸮿� �ø� Ŭ���� �޼ҵ� ȣ���ϱ�
		obj.show();
		System.out.println("staticTest3()");
	}
}