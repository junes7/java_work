package chap09.api.lang;
//StringŬ������ �⺻ �޼ҵ�� StringŬ������ Ư¡
//=> ���ڿ�ó�� �޼ҵ带 ���� ȣ���ϰų� +�����ڷ� ���ڿ��� �����ϴ� �۾��� ���� ���
// String�� ������� �ʰ� StringBuffer or StringBuilder�� ����Ѵ�.
public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�.");
		//������ȯ ���� �޼ҵ���� �ٸ� String��ü�� ���鶧 ���� ��Ʈ���� �о�� �۾��Ѵ�.
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("����������:"+str1);
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		System.out.println("str1.substring(2)=>"+str1.substring(2));
		System.out.println("str1.substring(2,8)=>"+str1.substring(2,8));
		System.out.println("str1.replace('a', 'A')=>"+str1.replace('a', 'A'));
		System.out.println("����������:"+str1);
		//ex) ������ȯ String 5�� ������� ��
		//-> ���� string 5���� �Ҵ�ȴ�.
		//���� ���ڿ� ������ ����� �������� String ������ Ÿ���� ���� �ʴ´�.
		//-> memory buffer overflow�� �Ͼ �� �����Ƿ�
		//�̷� �� Stringbuffer�� Stringbuilder�� ����Ѵ�.
		//Stringbufferó��(�������ӿ� ���� ���)�� ��  �Ǿ��ִ�.
		//Stringbuilderó��(�������ӿ� ���� ���)�� �� �� �Ǿ��ִ�.
	}
}