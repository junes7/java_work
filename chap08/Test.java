package chap08;

public class Test {
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		int num = obj.test(100,0);
		System.out.println("���!!!!!!!"+num);
		
		ThrowsTest02 obj2 = new ThrowsTest02();
		int num2=0;
		int inputNum = 100; //�ܺο��� �Է¹��� ��
		try {
			num2 = obj2.test(inputNum,0); //�����߻� ���ɼ��� �ִ� �ڵ�
		} catch(ArithmeticException e) {
			//¦���� 100000 Ȧ���� 0
			if(inputNum%2==0) {
				num2 = 100000;
			} else {
				num2 = 0;
			}
		}
		System.out.println("���!!!!!!!"+num2);

	}

}
