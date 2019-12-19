package chap04;
// 구구단 출력
// 1단을 1줄에 출력하고 줄 바꾼다.
// Continue문 연습 - 선언된 위치 아래의 코드를 skip하기 위해 사용
public class GuGu_Continue {
	public static void main(String[] args) {
		for(int dan=2;dan<=9;dan++) {
			if(dan==5) {
				continue;
			}
			for(int j=1;j<=9;j++) {
				System.out.print(dan+"*"+j+"="+dan*j+"\t");
			}
			System.out.println();
		}
	}
}