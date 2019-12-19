package chap03;

import java.util.Random;

public class APIExam {

	public static void main(String[] args) {
		Random rand = new Random();
		// nextInt 메소드 호출해서 랜덤값을 출력
		int rnum = rand.nextInt();
		System.out.println("랜덤값 => "+rnum);
		// 1부터 100까지 랜덤값 출력하기
		rnum = rand.nextInt(100)+1;
		System.out.println("랜덤값 => "+rnum);
	}
}