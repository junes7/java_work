package chap08;
import java.util.Scanner;
public class Prob1 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		
		String str= scan.nextLine();
		int result= 0;
		//���⸦ �ۼ��Ͻʽÿ�. try~~catch�� ���� ó��
		try {
			//convert ȣ��
			result = convert(str);
			System.out.println("��ȯ�� ���ڴ� "+result+" �Դϴ�.");
		//
		} catch (IllegalArgumentException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�. ���ڿ��� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");		
		}
	}
	
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException, NumberFormatException {
		//���⸦ �ۼ��Ͻʽÿ�.
		int num = 0;
		if(str.equals(null) | str.length() == 0) {
			throw new IllegalArgumentException();
		}
		num = Integer.parseInt(str);
		return num;
	}
}