package oop.chap07.poly;
/*
 * ��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
 * instanceof�����ڸ� �̿�
 * 
 */
class AA {
	
}
interface IA{
	
}

public class InstanceOfTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//obj�� SuperAŸ���̶�� if���� �����ض�.
		//		----------------
		//		SuperA�� ������?
		if(obj instanceof SuperA) {
			System.out.println("SuperAŸ���̴�.");
		} else {
			System.out.println("SuperAŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		if(obj instanceof InterA) {
			System.out.println("InterAŸ���̴�.");
		} else {
			System.out.println("InterAŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		if(obj instanceof InterB) {
			//((SubA)obj).display(num);
			System.out.println("InterBŸ���̴�.");
		} else {
			System.out.println("InterBŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		if(obj instanceof InterC) {
			System.out.println("InterCŸ���̴�.");
		} else {
			System.out.println("InterCŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		if(obj instanceof IA) {
			System.out.println("IAŸ���̴�.");
		} else {
			System.out.println("IAŸ���� �ƴϴ�.");
		}
		
	}
}
