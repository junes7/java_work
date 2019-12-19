package oop.chap07;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Kim",25,100,90,95,89);
		Student s2 = new Student("Lee",20,60,70,99,98);
		Student s3 = new Student("Park",19,68,86,60,40);

		Teacher t1 = new Teacher("장동건",45,"Spring");
		Staff e = new Staff("김서연",25,"전산실");
		
		s1.print();
		s2.print();
		s3.print();
		t1.print();
		e.print();
	}
}
