package workbook_week3;

public class Test06_Array {
	public static void main(String[] args) {
		//Student Ŭ���� �迭�� �Ʒ��� ���� �� ���� �����ϸ� �Ʒ��� ���� ������ �߻��Ѵ�.
		//Exception in thread "main" java.lang.NullPointerException
		//at workbook_week3.Test06.main(Test06.java:24)
		//�� ������ Ŭ������ ���������� �ٸ� ���� ������ �ϴµ� null���� ������ ���� ���� �����̴�.
		//��, �� ���´� Student �� Ŭ������ ���� �׸��� ������ ������ �� �ȿ� ���� ������ ���� �޼ҵ带
		//������ ������ �� �� �־��� ������ ���� �����̴�. 
		Student[] stu = new Student[3];
		//�׷��� �Ʒ��ٰ� ���� �� �迭�� heap�� �Ҵ�Ǵ� Ŭ���� ��ü�� �����Ͽ� �ִ� �ʱ�ȭ �۾��� �� �־�� �Ѵ�.
		for(int i=0;i<stu.length;i++) {
			stu[i] = new Student();
		}
		stu[0].setName("Kim");
		stu[0].setKorean(100);
		stu[0].setEnglish(90);
		stu[0].setMath(95);
		stu[0].setScience(89);
		stu[1].setName("Lee");
		stu[1].setKorean(60);
		stu[1].setEnglish(70);
		stu[1].setMath(99);
		stu[1].setScience(98);
		stu[2].setName("Park");
		stu[2].setKorean(68);
		stu[2].setEnglish(86);
		stu[2].setMath(60);
		stu[2].setScience(40);
		// ������ش�.
		for(int i=0;i<stu.length;i++) {
			stu[i].print();
		}
/*		stu[0].print();
		stu[1].print();
		stu[2].print();
*/
	}
}
