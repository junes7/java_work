package oop.chap07;

import java.util.Random;

public class StaticMethodDemoTest {
	public static void main(String[] args) {
		//API�� static �޼ҵ� �����ϱ�
		//=> static����� �ν��Ͻ��� ������ �ƴϹǷ� ������ Ŭ���������� �����Ѵ�.
		//static�޼ҵ�(Ŭ�����޼ҵ�)�� ȣ��
		System.out.println(Math.PI);
		System.out.println(Math.random());
		//non-static�޼ҵ�(�Ϲݸ޼ҵ�-�ν��Ͻ��޼ҵ�)
		//��ü������ �� �Ŀ� ���������� ���ؼ� �׼���
		Random rand = new Random();
		System.out.println(rand.nextInt());
	}

}
