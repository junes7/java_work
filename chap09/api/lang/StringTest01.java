package chap09.api.lang;
//StringŬ���� ����� �� ������
public class StringTest01 {
	public static void main(String[] args) {
		//String�� ������� ����Ǵ� Ǯ�� ����
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str1==str2) { //����.
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		if(str1==str3) { //�ٸ���.
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		if(str3==str4) { //�ٸ���.
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		//String�� "���ڿ�"�� ���·� ���ǵ� �� �ְ�
		//�ν��Ͻ��� ���·� ���ǵ� �� ������ ���ڿ��� �񱳴� ������ equals�޼ҵ带
		//�̿��ؼ� ��
		
		
	}

}
