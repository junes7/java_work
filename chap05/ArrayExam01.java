package chap05;
/*
 * -int형 배열 작성
 * -요소의 갯수: 10
 * - 2번		3번		5번 요소(index)에
 *   100	200		300 각각 초기화
 * - 모든 요소의 값 출력하기
 */
public class ArrayExam01 {
	public static void main(String[] args) {
		int[] myarr = new int[10];
		myarr[2] = 100;
		myarr[3] = 200;
		myarr[5] = 300;
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
	}
}