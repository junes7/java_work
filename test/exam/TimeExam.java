package test.exam;
public class TimeExam{
	public static void main(String[] args){
		// time ������ ����� ���� �� �������̴�.
		// ___�� ____�� ____�� �� ���·� ����ϱ�
		int time = 8888;
/*
		int hour = time / 3600;
		int rem1 = time % 3600;
		int min = rem1 / 60;
		int sec = rem1 % 60;
		System.out.println("time ������ "+hour+"�� "+min+"�� "+sec+"�� �̴�.");
*/
		// ����� ���
		int h = time/(60*60);
		int time2 = time%(60*60);
		int m = time2/60;
		int s = time2%60;
		// �ϳ��� ����� ���鼭 Ȯ���غ���.
		System.out.println(h+"�� " + m+"�� "+ s+"��");
	}
}