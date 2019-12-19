package chap09.api.lang;
//String과 StringBuffer의 성능비교
public class StringStringBufferTest {
	//String의 작업을 체크하는 메소드
	public static void stringCheck(int count) {
		//시작할 때 시간 측정 - nano초
		long start = System.nanoTime();//10억분의 1초
		String str = new String("자바");
		for(int i=1;i<=count;i++) {
			str+="java";
		}
	
	long end = System.nanoTime();
	long time = end-start;
	System.out.println("str=str+java");
	System.out.println("걸린시간:"+time);
	}	
	//StringBuffer의 작업을 체크하는 메소드
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("자바");
		for(int i=1;i<=count;i++) {
			sb.append("java");
		}
	
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")");
		System.out.println("걸린시간:"+time);		
	}
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수:"+count);
		stringCheck(count);
		stringBufferCheck(count);
	}
}
