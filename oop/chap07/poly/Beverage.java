package oop.chap07.poly;

public abstract class Beverage {
	//Ŭ���� ������� ����
	private String name;
	protected int price;
	//������ ����
	public Beverage() {
		
	}
	public Beverage(String name) {
		this.name=name;
	}
	//setter�� getter����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//�߻� �޼ҵ�
	public abstract void calcPrice();
	public void print() {
		System.out.println(name+"�̸�, ������ "+price+"\n");
	}
}
