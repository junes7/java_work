package oop.chap06;
//메소드의 매개변수로 기본형과 참조형을 정의하는 경우 차이점
public class CallByTest {
	public static void main(String[] args) {
		//사용할 기본형변수와 참조형 변수의 초기화
		CallByTest obj = new CallByTest();
		int i = 100;
		int[] myarr = new int[5];
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		System.out.println("========change호출전=======");
		obj.display(i, myarr);
		obj.change(i, myarr);
		System.out.println("========change호출후=======");
		obj.display(i, myarr);
	}
	//매개변수로 전달된 num값과 myarr가 참조하는 배열의 요소값을 출력하는 메소드
	public void display(int num, int[] myarr) {
		System.out.println("i="+num);
		System.out.println("myarr의 요소 값");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i]+"\t");
		}
		System.out.println();
	}
	//매개변수로 전달된 i와 myarr가 참조되는 배열의 요소 값을 변경하는 메소드
	public void change(int i, int[] myarr) {
		i = 200;
		myarr[1] = 200;
	}

}
