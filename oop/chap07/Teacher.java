package oop.chap07;

public class Teacher extends Person {
	//private String name;
	//private int age;
	private String subject;
	// 积己磊 积己
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
/*		super();
		this.name = name;
		this.age = age;*/
		super(name,age);
		this.subject = subject;
	}
	//setter客 getter 积己
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	//免仿窍扁
	public void print() {
		super.print();
		System.out.println(" 苞格:"+getSubject());
	}
	
}
