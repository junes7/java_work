package chap04;
// ������ ���
// 1���� 1�ٿ� ����ϰ� �� �ٲ۴�.
// break�� ���� - break���� ����� ���� ����������.
public class GuGu_Break {
	public static void main(String[] args) {
		for(int dan=2;dan<=9;dan++) {
			if(dan==5) {
				break;
			}
			for(int j=1;j<=9;j++) {
				/*if(dan==5) { //break���� ���� for�� ����Ǿ� �����Ƿ�
					break;	   //�ݺ����� ��������� �ʴ´�.
				}*/
				System.out.print(dan+"*"+j+"="+dan*j+"\t");
			}
			System.out.println();
		}
	}
}