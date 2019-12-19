package workbook_week5;

public class StudentTest {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
		//Student 객체를 3개 생성하여 배열에 넣는다.
		//name, age, height, weight
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("임꺽정",16,175,65);
		//배열에 있는 객체 정보를 모두 출력 한다 - for문을 이용할 것
		System.out.println("이름\t나이\t신장\t몸무게\t");
		for(int i=0; i<studentArray.length; i++) {
			studentArray[i].print();
		}
		//나이의 평균 출력
		int sum = 0, sum1 = 0, sum2 = 0;
		double avg = 0, avg1 = 0, avg2 = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sum+=studentArray[i].getAge();
			//sum= sum + studentArray[i].getAge();
		}
		avg = (double)sum/studentArray.length;	
		//신장의 평균 출력
		for (int i = 0; i < studentArray.length; i++) {
			sum1+=studentArray[i].getHeight();
		}
		avg1 = (double)sum1/studentArray.length;
		
		//몸무게의 평균 출력
		for (int i = 0; i < studentArray.length; i++) {
			sum2+=studentArray[i].getWeight();
		}
		avg2 = (double)sum2/studentArray.length;
		//출력하기
		System.out.println("나이의 평균: "+String.format("%.2f", avg));
		System.out.println("신장의 평균: "+String.format("%.2f", avg1));
		System.out.println("몸무게의 평균: "+String.format("%.2f", avg2));
	}
}