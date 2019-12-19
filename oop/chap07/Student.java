package oop.chap07;

public class Student extends Person {
	//private String name;
	//private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	public Student() {
		
	}
	
	/*public Student(String name, int age, int korean, int english, int math, int science) {
		//super();
		//this.name = name;
		super(name,age);
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}*/

	public Student(String name, int age, int korean, int english, int math, int science) {
		//부모의 private멤버를 직접 액세스하지 않고
		//생성자를 호출하며 전달한다.
		super(name,age);
		//this.name = name;
		//this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
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
	
	public double getAvg() {
		double avg = 
				(this.korean+this.english+this.math+this.science)/4.0;
		return avg;
	}
	public String getGrade() {
		double avg = getAvg();
		String grade = "";
		if(avg>100 | avg<0) {
			System.out.println("잘못입력");
		}else {
			if(avg>=90) {
				grade = "A학점";
			}else if(avg>=70) {
				grade = "B학점";
			}else if(avg>=50) {
				grade = "C학점";
			}else if(avg>=30) {
				grade ="D학점";
			}else {
				grade ="F학점";
			}
		}
		return grade;
	}
	public void print() {
		//print();
		//지금 위의 상태는 내 클래스의 프린트 메소드를 호출하는데 계속 호출하여
		//Stack 메모리가 차다가 overflow(넘쳐 흘러서)되어서 에러남.
		//부모클래스인 Person클래스의 print메소드를 호출
		//하기 위해서 부모의 프린트라는 표시가 있어야 한다.
		super.print();
		System.out.println(" 평균:"+getAvg()+" 학점:"+getGrade());
	}
	public static void show() {
		System.out.println("=================================");
	}
	
	
}
















