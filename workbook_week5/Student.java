package workbook_week5;

public class Student {
	//Ŭ���� ������� ����
	private String name;
	private int age;
	private int height;
	private int weight;
	//������ ����
	public Student() {
		
	}
	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//setter��  getter ����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//����ϱ�
	public void print() {
		System.out.println(name+"\t"+age+"\t"+height+"\t"+weight+"\t");
	}
}
