package chap03;
// �񱳿����� - ||, &&(���ƿ�����) - ��� ���� �˻����� �ʰ� ���ǿ� �����ϸ� skip�ϴ� ��찡 �߻��Ѵ�.
public class OprTest04_Short {
	public static void main(String [] args) {
		int num = 100;
		String str = null; // ���� str�� �ƹ��͵� ������� ���� ����
		//str.length();
		// ||�����ڴ� or�������� Ư���� �ľ��ϰ� ù ��° ���� true�̸� ���� ���� �˻����� �ʴ´�.
		System.out.println(num>=100 || str.length()>10);
		//System.out.println(num>=100 | str.length()>10);
		// &&�����ڴ� and�������� Ư���� �ľ��ϰ� ù ��° ���� false�̸� ���� ���� �˻����� �ʴ´�.
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}
}