package oop.chap07;

public class IceCream extends Dessert {
	//Ŭ���� ������� ����
	private int calorie;
	//������ ����
	public IceCream() {
		
	}
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName,price,count);
		this.calorie = calorie;
	}
	//setter�� getter����
	
	
	
	//�޼ҵ� ����
	public static void print() {
		System.out.println("==============================");
		System.out.println("�ֹ��׸�\t����\t����\tĮ�θ�");
		System.out.println("==============================");		
	}
	public void printProductInfo() {
		/*System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+calorie);*/
		super.printProductInfo();
		System.out.println("\t"+calorie+"kcal");
	}
}