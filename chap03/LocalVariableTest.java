package chap03;
//�������� - { }(��) �ȿ��� ����� ����
//			����� ���� ����Ǹ� �޸𸮿��� ����
//					[��Ģ]
//			1) ����� �� ���ο����� ����� ����
//			2) �ݵ�� �ʱ�ȭ �۾��� �ؾ� �Ѵ�.
public class LocalVariableTest {
	public static void main(String[] args) {
		int num = 90;
		int sum=0;
		if(num>=90) {
			String str = new String("�հ�");
			sum+=100; //sum������ main�޼ҵ� ������ ����� ���������̹Ƿ�
					  //�ʱ�ȭ �۾��� ���� �ʰ� ����� �� ����.
		}
		//System.out.println(str); //str������ if������ ����Ǿ����Ƿ�
								 //if�� �ۿ����� ������ �� ����.
	}
}
