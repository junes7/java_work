package oop.chap07;

public class Staff extends Person {
	//private String name;
	//private int age;
	private String dept;
	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
/*		super();
		this.name = name;
		this.age = age;*/
		super(name,age);
		this.dept = dept;
	}
	//위가 바로 default 상황이다.
	//setter와 getter 생성
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		super.print();
		System.out.println(" 부서:"+getDept());
	}
	
}
