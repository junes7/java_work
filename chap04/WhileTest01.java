package chap04;

//while�� ���� - ForTest01.java���� �۾��� ������ while������ ����
//"�ڹ����α׷���" 5�� ���
public class WhileTest01 {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.println("�ڹ����α׷���"+i);
			i++;//i=i+1
		}
		System.out.println("==========================");
		i=1;
		//while�� ���ѷ����� ����.
		while(true) {
			System.out.println("�ڹ����α׷���"+i);
			if(i>4) {
				// �ݺ����� ����������
				break;
			}
			i++; //i=i+1
		}
	}
}