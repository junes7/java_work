package oop.chap06;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	private int age;
	
	public Student() {
		
	}	
	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
/*	public Student(String name, int korean, int english, int math, int science) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.math=math;
		this.science=science;
	}*/
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
		// ������ String ������ �ʱ�ȭ �� ���� �Ʒ�ó�� �ʱ�ȭ�ϸ� �ȴ�.
		String str = "";
		if(avg1<0 | avg1>100) {
			str = "�߸��Է�";
		} else {
			switch((int)avg1/10) {
				case 10:
				case 9:
					str = "A����";
					break;
				case 8:
				case 7:
					str = "B����";
					break;
				case 6:
				case 5:
					str = "C����";
					break;
				case 4:
				case 3:
					str = "D����";
					break;
				default:
					str = "F����";
			}
		}
		return str;
	}
	public void print() {
		System.out.println(getName()+" ���:"+getAvg()+" ����:"+getGrade());
	}
	public static void print1() {
		System.out.println("============================================");
	}
}