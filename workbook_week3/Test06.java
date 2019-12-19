package workbook_week3;

public class Test06 {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("Kim");
		stu1.setKorean(100);
		stu1.setEnglish(90);
		stu1.setMath(95);
		stu1.setScience(89);
		Student stu2 = new Student();
		stu2.setName("Lee");
		stu2.setKorean(60);
		stu2.setEnglish(70);
		stu2.setMath(99);
		stu2.setScience(98);
		Student stu3 = new Student();
		stu3.setName("Park");
		stu3.setKorean(68);
		stu3.setEnglish(86);
		stu3.setMath(60);
		stu3.setScience(40);
		stu1.print();
		stu2.print();
		stu3.print();
//		System.out.println(stu[0].getName()+" Æò±Õ:"+stu[0].getAvg()+" ÇÐÁ¡:"+stu[0].getGrade());
//		System.out.println(stu[1].getName()+" Æò±Õ:"+stu[1].getAvg()+" ÇÐÁ¡:"+stu[1].getGrade());
//		System.out.println(stu[2].getName()+" Æò±Õ:"+stu[2].getAvg()+" ÇÐÁ¡:"+stu[2].getGrade());
	}
}