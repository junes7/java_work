package chap03_Prac;
// 3-10
public class prac09 {
	public static void main(String [] args) {
		char ch = 'A';
		char lowercase = (('A'<=ch)&&(ch<='Z'))? (char)(ch+32):ch;
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase:"+lowercase);
	}
}