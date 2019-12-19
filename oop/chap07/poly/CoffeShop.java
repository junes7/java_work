package oop.chap07.poly;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****\n");
		//Beverage �迭 �׸� ����
		Beverage[] beverage = new Beverage[5];
		//�� �迭 �׸��� ����� ���� Ŭ���� �Ҵ�
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		//���� ���� ���
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>"+getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>"+Coffee.amount+"��");
		System.out.println("Tea�� �Ǹ� ����=>"+Tea.amount+"��");
	}
	//����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���
	public static void getSalesInfo(Beverage[] beverage) {
		for (int i = 0; i < beverage.length; i++) {			
			System.out.print((i+1)+" ��° �Ǹ� ����� ");
			beverage[i].print();
		}
	}
	//����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
	public static int getTotalPrice(Beverage[] beverage) {
		int totalPrice = 0;
		for (int i = 0; i < beverage.length; i++) {
			totalPrice+=beverage[i].getPrice();
		}
		return totalPrice;
	}
}
