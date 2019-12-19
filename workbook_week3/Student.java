package workbook_week3;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	/*	// name setter
	public void setName(String name) {
		this.name = name;
	}
	// name getter
	public String getName()
	{
		return this.name;
	}
	// korean setter
	public void setKorean(int korean) {
		this.korean = korean;
	}
	// korean getter
	public int getKorean() {
		return this.korean;
	}
	// english setter
	public void setEnglish(int english) {
		this.english = english;
	}
	// english getter
	public int getEnglish() {
		return this.english;
	}
	// math setter
	public void setMath(int math) {
		this.math = math;
	}
	// math getter
	public int getMath() {
		return this.math;
	}
	// science setter
	public void setScience(int science) {
		this.science = science;
	}	
	// science getter
	public int getScience() {
		return this.science;
	}*/
	// average getter
	public double getAvg() {
		double avg = 0.0;
		int sum = this.korean + this.english + this.math + this.science;
		avg = (double)sum/4;
		return avg;
	}
	// grade getter
	public String getGrade() {
		double avg1 = getAvg();
		// 앞으로 String 변수를 초기화 할 때는 아래처럼 초기화하면 된다.
		String str = "";
		if(avg1<0 | avg1>100) {
			str = "잘못입력";
		} else {
			switch((int)avg1/10) {
				case 10:
				case 9:
					str = "A학점";
					break;
				case 8:
				case 7:
					str = "B학점";
					break;
				case 6:
				case 5:
					str = "C학점";
					break;
				case 4:
				case 3:
					str = "D학점";
					break;
				default:
					str = "F학점";
			}
		}
		return str;
	}
	public void print() {
		System.out.println(getName()+" 평균:"+getAvg()+" 학점:"+getGrade());
	}
}


/*	public Student(String name, int korean, int english, int math, int science) {

}
*/