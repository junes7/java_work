package oop.chap07;
//StaticDemo�� �׽�Ʈ�ϴ� Ŭ����
//static���� ������ ������ �ν��Ͻ��� ������ ���� �����ϴ� �ν��Ͻ� ������ �ƴϹǷ�
//�ν��Ͻ������� ������ �� ����.
//Ŭ���������� �����ؾ� �Ѵ�.
public class StaticDemoTest {
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();
		System.out.println(obj1.num+","+obj1.staticNum);

		StaticDemo obj2 = new StaticDemo("obj2");
		obj2.display();
		System.out.println(obj2.num+","+obj2.staticNum);

		StaticDemo obj3 = new StaticDemo("obj3");
		obj3.display();
		System.out.println(obj3.num+","+obj3.staticNum);
	}
}