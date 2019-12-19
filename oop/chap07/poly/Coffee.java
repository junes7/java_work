package oop.chap07.poly;

public class Coffee extends Beverage {
	//Ŭ���� ������� ����
	static int amount;
	//������ ����
	public Coffee() {
		
	}
	public Coffee(String name) { //Coffee�� �Ǹ�
		super(name);
		//�ֹ��Ǵ� ������ ������ ���
		calcPrice();
		amount++;
	}
	//setter�� getter ����
	//static ����� �׼����ϱ� ���ؼ� static �޼ҵ带 �����ؼ� �׼����Ѵ�.
	public int getAmount() {
		return amount;
	}
	//calcPrice �������̵�
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")) {
			super.setPrice(1500);
		} else if (getName().equals("CafeLatte")) {
			super.setPrice(2500);
		} else if (getName().equals("Cappuccino")) {
			super.setPrice(3000);
		}
	}
	
}
