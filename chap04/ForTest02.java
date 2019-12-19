package chap04;
//for문 중첩하기
public class ForTest02 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int i=1;i<=row;i++) {
				if(row==3 & i==2) {
					System.out.print("너");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}