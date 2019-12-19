package test.exam;
public class TimeExam{
	public static void main(String[] args){
		// time 변수에 저장된 값은 초 데이터이다.
		// ___시 ____분 ____초 의 형태로 출력하기
		int time = 8888;
/*
		int hour = time / 3600;
		int rem1 = time % 3600;
		int min = rem1 / 60;
		int sec = rem1 % 60;
		System.out.println("time 변수는 "+hour+"시 "+min+"분 "+sec+"초 이다.");
*/
		// 강사님 방법
		int h = time/(60*60);
		int time2 = time%(60*60);
		int m = time2/60;
		int s = time2%60;
		// 하나씩 출력해 가면서 확인해본다.
		System.out.println(h+"시 " + m+"분 "+ s+"초");
	}
}