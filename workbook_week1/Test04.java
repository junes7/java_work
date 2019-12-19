package workbook_week1;

public class Test04 {
	public static void main(String[] args) {
		char ch = 'A';
		boolean b = ('a'<=ch && ch<='z')||('A'<=ch && ch<='Z');
		//boolean b = (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')?true:false;
		System.out.println(b);
	}
}