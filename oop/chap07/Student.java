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
		//�θ��� private����� ���� �׼������� �ʰ�
		//�����ڸ� ȣ���ϸ� �����Ѵ�.
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
			System.out.println("�߸��Է�");
		}else {
			if(avg>=90) {
				grade = "A����";
			}else if(avg>=70) {
				grade = "B����";
			}else if(avg>=50) {
				grade = "C����";
			}else if(avg>=30) {
				grade ="D����";
			}else {
				grade ="F����";
			}
		}
		return grade;
	}
	public void print() {
		//print();
		//���� ���� ���´� �� Ŭ������ ����Ʈ �޼ҵ带 ȣ���ϴµ� ��� ȣ���Ͽ�
		//Stack �޸𸮰� ���ٰ� overflow(���� �귯��)�Ǿ ������.
		//�θ�Ŭ������ PersonŬ������ print�޼ҵ带 ȣ��
		//�ϱ� ���ؼ� �θ��� ����Ʈ��� ǥ�ð� �־�� �Ѵ�.
		super.print();
		System.out.println(" ���:"+getAvg()+" ����:"+getGrade());
	}
	public static void show() {
		System.out.println("=================================");
	}
	
	
}
















