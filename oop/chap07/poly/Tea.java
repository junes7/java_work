package oop.chap07.poly;

public class Tea extends Beverage {
	//Ŭ���� ������� ����
	static int amount;
	//������ ����
	public Tea() {
		
	}
	public Tea(String name) { //Tea�� �Ǹ�
		super(name);
		//�ֹ��Ǵ� ������ ������ ���
		calcPrice();
		amount++;
	}
	//setter�� getter ����
	//static ����� �׼����ϱ� ���ؼ� static �޼ҵ带 �����ؼ� �׼����Ѵ�.
	public static int getAmount() {
		return amount;
	}
	//calcPrice �������̵�
	@Override
	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			super.setPrice(1500);
		} else if (getName().equals("ginsengTea")) {
			super.setPrice(2000);
		} else if (getName().equals("redginsengTea")) {
			super.setPrice(2500);
		}
	}	
}
