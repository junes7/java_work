package chap09.api.lang;
//String�� StringBuffer�� ���ɺ�
public class StringStringBufferTest {
	//String�� �۾��� üũ�ϴ� �޼ҵ�
	public static void stringCheck(int count) {
		//������ �� �ð� ���� - nano��
		long start = System.nanoTime();//10����� 1��
		String str = new String("�ڹ�");
		for(int i=1;i<=count;i++) {
			str+="java";
		}
	
	long end = System.nanoTime();
	long time = end-start;
	System.out.println("str=str+java");
	System.out.println("�ɸ��ð�:"+time);
	}	
	//StringBuffer�� �۾��� üũ�ϴ� �޼ҵ�
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("�ڹ�");
		for(int i=1;i<=count;i++) {
			sb.append("java");
		}
	
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")");
		System.out.println("�ɸ��ð�:"+time);		
	}
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("����Ƚ��:"+count);
		stringCheck(count);
		stringBufferCheck(count);
	}
}
