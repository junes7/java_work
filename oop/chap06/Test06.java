package oop.chap06;

public class Test06 {
	public static void main(String[] args) {
		Student stu1 = new Student("kim",100,90,95,89);
		Student stu2 = new Student("Lee",60,70,99,98);
		Student stu3 = new Student("Park",68,86,60,40);
		stu1.print();
		stu2.print();
		stu3.print();
//		System.out.println(stu[0].getName()+" Æò±Õ:"+stu[0].getAvg()+" ÇÐÁ¡:"+stu[0].getGrade());
//		System.out.println(stu[1].getName()+" Æò±Õ:"+stu[1].getAvg()+" ÇÐÁ¡:"+stu[1].getGrade());
//		System.out.println(stu[2].getName()+" Æò±Õ:"+stu[2].getAvg()+" ÇÐÁ¡:"+stu[2].getGrade());
	}
}