package workbook_week5;

public class StudentTest {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
		//Student ��ü�� 3�� �����Ͽ� �迭�� �ִ´�.
		//name, age, height, weight
		studentArray[0] = new Student("ȫ�浿",15,171,81);
		studentArray[1] = new Student("�ѻ��",13,183,72);
		studentArray[2] = new Student("�Ӳ���",16,175,65);
		//�迭�� �ִ� ��ü ������ ��� ��� �Ѵ� - for���� �̿��� ��
		System.out.println("�̸�\t����\t����\t������\t");
		for(int i=0; i<studentArray.length; i++) {
			studentArray[i].print();
		}
		//������ ��� ���
		int sum = 0, sum1 = 0, sum2 = 0;
		double avg = 0, avg1 = 0, avg2 = 0;
		for (int i = 0; i < studentArray.length; i++) {
			sum+=studentArray[i].getAge();
			//sum= sum + studentArray[i].getAge();
		}
		avg = (double)sum/studentArray.length;	
		//������ ��� ���
		for (int i = 0; i < studentArray.length; i++) {
			sum1+=studentArray[i].getHeight();
		}
		avg1 = (double)sum1/studentArray.length;
		
		//�������� ��� ���
		for (int i = 0; i < studentArray.length; i++) {
			sum2+=studentArray[i].getWeight();
		}
		avg2 = (double)sum2/studentArray.length;
		//����ϱ�
		System.out.println("������ ���: "+String.format("%.2f", avg));
		System.out.println("������ ���: "+String.format("%.2f", avg1));
		System.out.println("�������� ���: "+String.format("%.2f", avg2));
	}
}