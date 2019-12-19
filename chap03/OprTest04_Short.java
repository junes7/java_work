package chap03;
// 비교연산자 - ||, &&(숏컷연산자) - 모든 항을 검사하지 않고 조건에 만족하면 skip하는 경우가 발생한다.
public class OprTest04_Short {
	public static void main(String [] args) {
		int num = 100;
		String str = null; // 현재 str은 아무것도 저장되지 않은 변수
		//str.length();
		// ||연산자는 or연산자의 특성을 파악하고 첫 번째 항이 true이면 뒤의 항은 검사하지 않는다.
		System.out.println(num>=100 || str.length()>10);
		//System.out.println(num>=100 | str.length()>10);
		// &&연산자는 and연산자의 특성을 파악하고 첫 번째 항이 false이면 뒤의 항은 검사하지 않는다.
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}
}