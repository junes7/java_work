package chap05;

import java.util.Random;

//�迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϱ�
public class ArrayTest04 {
	public static void main(String[] args) {
		//�ٸ� ���� ������ ������� �����ϴ� ��� -> ,�� �迭 ��Ҹ� �����Ѵ�.
		//int[] myarr = new int[5];
		int[] myarr = {10,20,30,40,50};
		System.out.println("�迭�� ����ǰ���:"+myarr.length);
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
		System.out.println("-------------");
		//�ڹپ�� ��� ����,����,�ʱ�ȭ
		//�׷��� ���� ����� �� ���� ����Ѵ�.
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println("�迭�� ����� ����:"+myarr2.length);
		for(int i=0;i<myarr2.length;i++) {
			System.out.println(myarr2[i]);
		}
		//������ �迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
		/*
		 * String[] strArr = new String[3];
		 * strArr[0] = new String("java");
		 * strArr[1] = new String("servlet");
		 * strArr[2] = new String("spring");
		 */
		String[] strArr = {new String("java"),
							new String("servlet"),
							new String("spring")};
		System.out.println("������ �迭�� ����:"+strArr.length);
		//������ �迭�̱� ������ ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ�
		//String�� �����̴�. ��, ���ڿ��� �ٷ� ������ִ� �޼��尡 �����ϱ⿡
		//heap�� �Ҵ�� String�� �迭 �� �ʱ�ȭ ���� ���ڿ��� ��µȴ�.
		for(int i=0;i<strArr.length;i++) {
			System.out.println("�迭���=>"+strArr[i]);
		}
		Random[] randArr = {new Random(),new Random(),new Random()};
		for(int i=0;i<randArr.length;i++) {
			System.out.println("�迭���=>"+randArr[i]);
		}
		//String�� ���� �������� �⺻��ó�� ����� �� �ִ�. -> ���� ���� ���̴�
		//���������� ����Ѵ�.
		String[] strArr2 = {"java","servlet","spring","hadoop"};
		System.out.println("������ �迭�� ����:"+strArr2.length);
		for(int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}
	}
}
