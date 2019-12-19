package chap04;
// 구구단 출력
// 1단을 1줄에 출력하고 줄 바꾼다.
public class GuGu {
	public static void main(String[] args) {
		for(int dan=2;dan<10;dan++) {
			for(int j=1;j<10;j++) {
				System.out.print(dan+"*"+j+"="+dan*j+"\t");
			}
			System.out.println();
		}
	}
}