package workbook_week2;
//���Ǳ���
public class Test01 {
	public static void main(String[] args) {
		int inx =15;
		//1. int�� ����x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		if(10<inx && inx<20) {
			System.out.println("true");
		}
		char ch1 = ' ';
		//2. char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ� 
		if(ch1==' ' || ch1=='\t') {
			System.out.println("true");
		}
		char ch2 = 'x';
		//3. char�� ���� ch�� 'x'�Ǵ� 'X'�� �� true�� ���ǽ�
		if(ch2=='x' || ch2=='X') {
			System.out.println("true");
		}
		char ch3 = '0';
		//4. char�� ���� ch�� ����('0' ~ '9')�� �� true�� ���ǽ�
		if('0'<=ch3 && ch3<='9') {
			System.out.println("true");
		}
		System.out.println("----------");
		char ch4 = 'a';
		//5. char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
		if(('A'<=ch4 && ch4<='Z') || ('a'<=ch4 && ch4<='z')) {
			System.out.println("true");
		}
		int year =32;
		//6.int�� ���� year�� 400���� ���� �������ų� �Ǵ� 4�� ���� ��������
		//100���� ���� �������� ���� �� true�� ���ǽ�
		if((year%400==0 || year%4==0) && year%100!=0 ) {
			//System.out.println("test");
			System.out.println("true");
		}
		boolean powerOn = false;
		//7.boolean�� ���� powerOn�� false�� �� true�� ���ǽ�
		if(powerOn == false) {
			System.out.println("true");
		}
		String str = "yes";
		//8.���ڿ� �������� str�� "yes"�� �� true�� ���ǽ�
		if(str=="yes") {
			System.out.println("true");
		}
	}
}
