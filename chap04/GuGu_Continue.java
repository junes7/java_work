package chap04;
// ������ ���
// 1���� 1�ٿ� ����ϰ� �� �ٲ۴�.
// Continue�� ���� - ����� ��ġ �Ʒ��� �ڵ带 skip�ϱ� ���� ���
public class GuGu_Continue {
	public static void main(String[] args) {
		for(int dan=2;dan<=9;dan++) {
			if(dan==5) {
				continue;
			}
			for(int j=1;j<=9;j++) {
				System.out.print(dan+"*"+j+"="+dan*j+"\t");
			}
			System.out.println();
		}
	}
}