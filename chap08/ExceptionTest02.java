package chap08;
//try~~~catch�� ���ܸ� ó���� �� �ִ�.
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println("******���α׷� ����******");
			System.out.println(10/0);//���ܰ� �߻��� �� �ִ� ����
			System.out.println("******���α׷� ����******");
		} catch(ArithmeticException e) {
			System.out.println("�����߻�....");
			//e.getMessage�� �����޽����� �Ѱ��ִ� �޼ҵ��̴�.
			System.out.println("���ܸ޽���:"+e.getMessage());
			e.printStackTrace();//void
			//������ �����ϴ� �޼ҵ�; ���° �ٿ��� ������ �߻� �Ͽ����� �����Ͽ� �˷��ش�.
		}
	}
}
