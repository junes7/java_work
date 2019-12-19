package chap05;

public class ArrayCopyTest01 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		//배열에 값을 할당하기 위한 for문이다.
		for(int i=0;i<firstArr.length;i++) {
			firstArr[i] = 10+i;
		}
		//배열에 저장된 값을 출력하기 위한 for문이다.
		for(int i=0;i<firstArr.length;i++) {
			System.out.print("firstArr["+i+"]:"+firstArr[i]+"\t");
		}
		System.out.println();
		//배열의 사이즈를 변경
		//1. 새로운 배열을 생성한다.
		int[] secondArr = new int[firstArr.length*3];
		//2. 기존배열을 새로운 배열에 copy
		for(int i=0;i<secondArr.length;i++) {
			if(i==firstArr.length) {
				break;
			}
			secondArr[i] = firstArr[i];
		}
		//3. 복사된 배열 확인하기
		for(int i=0;i<secondArr.length;i++) {
			System.out.print("secondArr["+i+"]:"+secondArr[i]+"\t");
		}
		System.out.println();
	}
}
