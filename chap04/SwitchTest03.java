package chap04;
//switch�������� �������

public class SwitchTest03 {
	public static void main(String[] args) {
		//Switch�� ���ǹ��� int�� casting�� �� �ִ� ���� ��� �ִ� ����,�����,�޼ҵ�ȣ�⹮
		//					-----------------
		//					byte, short, int, char, string
		double d = 1.5;
		/*	switch(d) {
			case 1.0:
		}*/
		int data=5;
		switch(data+60) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
		}
		//String�� ���� String�� �⺻������ ����� �� �ְ� ����� ���Ҵ�.
		String code = new String("a01");
		switch(code) {
			case "a01":
				System.out.println("A01");
				break;
			case "a02":
				System.out.println("A02");
				break;
		}
	}
}