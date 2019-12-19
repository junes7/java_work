package workbook_week2;
//조건구문
public class Test01 {
	public static void main(String[] args) {
		int inx =15;
		//1. int형 변수x가 10보다 크고 20보다 작을 때 true인 조건식
		if(10<inx && inx<20) {
			System.out.println("true");
		}
		char ch1 = ' ';
		//2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식 
		if(ch1==' ' || ch1=='\t') {
			System.out.println("true");
		}
		char ch2 = 'x';
		//3. char형 변수 ch가 'x'또는 'X'일 때 true인 조건식
		if(ch2=='x' || ch2=='X') {
			System.out.println("true");
		}
		char ch3 = '0';
		//4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식
		if('0'<=ch3 && ch3<='9') {
			System.out.println("true");
		}
		System.out.println("----------");
		char ch4 = 'a';
		//5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		if(('A'<=ch4 && ch4<='Z') || ('a'<=ch4 && ch4<='z')) {
			System.out.println("true");
		}
		int year =32;
		//6.int형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고
		//100으로 나눠 떨어지지 않을 때 true인 조건식
		if((year%400==0 || year%4==0) && year%100!=0 ) {
			//System.out.println("test");
			System.out.println("true");
		}
		boolean powerOn = false;
		//7.boolean형 변수 powerOn가 false일 때 true인 조건식
		if(powerOn == false) {
			System.out.println("true");
		}
		String str = "yes";
		//8.문자열 참조변수 str이 "yes"일 때 true인 조건식
		if(str=="yes") {
			System.out.println("true");
		}
	}
}
