package workbook_week3;

public class Test06_Array {
	public static void main(String[] args) {
		//Student 클래스 배열을 아래와 같이 한 번만 정의하면 아래와 같은 에러가 발생한다.
		//Exception in thread "main" java.lang.NullPointerException
		//at workbook_week3.Test06.main(Test06.java:24)
		//이 에러는 클래스의 참조변수가 다른 값을 가져야 하는데 null값을 가지다 보니 생긴 오류이다.
		//즉, 이 상태는 Student 각 클래스를 담을 그릇만 생성해 놓았지 그 안에 무슨 변수와 무슨 메소드를
		//담을지 선언을 안 해 주었기 때문에 생긴 오류이다. 
		Student[] stu = new Student[3];
		//그래서 아래줄과 같이 각 배열에 heap에 할당되는 클래스 객체를 선언하여 넣는 초기화 작업을 해 주어야 한다.
		for(int i=0;i<stu.length;i++) {
			stu[i] = new Student();
		}
		stu[0].setName("Kim");
		stu[0].setKorean(100);
		stu[0].setEnglish(90);
		stu[0].setMath(95);
		stu[0].setScience(89);
		stu[1].setName("Lee");
		stu[1].setKorean(60);
		stu[1].setEnglish(70);
		stu[1].setMath(99);
		stu[1].setScience(98);
		stu[2].setName("Park");
		stu[2].setKorean(68);
		stu[2].setEnglish(86);
		stu[2].setMath(60);
		stu[2].setScience(40);
		// 출력해준다.
		for(int i=0;i<stu.length;i++) {
			stu[i].print();
		}
/*		stu[0].print();
		stu[1].print();
		stu[2].print();
*/
	}
}
