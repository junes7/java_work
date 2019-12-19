package chap04;
// char는 int로 자동 casting 가능하다.
public class ForExam01 {
	public static void main(String[] args) {
		//char ch = 'A';
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}