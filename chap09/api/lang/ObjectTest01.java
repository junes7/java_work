package chap09.api.lang;

import java.util.Date;
import java.util.Random;

//ObjectŬ������ �ڹٿ��� �ۼ��ϴ� ��� Ŭ������ �ֻ��� Ŭ����
public class ObjectTest01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //Ŭ������ ������ ����
		System.out.println(obj1.hashCode()); //��ü�� ������ ����
		System.out.println(obj1.toString()); //��ü�� �ּҸ� ���� - �⺻ �޼ҵ� �̰Ŵ� ������ �����ϴ�.
		System.out.println(obj1);//obj1.toString()ȣ��� ����
		//�⺻�޼ҵ��̹Ƿ� ������ �����ϴ�.
		Person p1 = new Person("�嵿��",50,"����");
		System.out.println(p1.getName()+","+p1.getAge()+","+p1.getAddr());
		
		
		System.out.println(p1.toString());
		//�����ڰ� �ۼ��ϴ� ��� Ŭ��������
		//�������̵��ؾ� �Ѵ�.
		
		System.out.println(p1);
		//API�� Ŭ������...
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
	}
}
