package oop.chap07.poly;

public abstract class Content {
	//Ŭ���� ������� ����
	String title;
	int price;
	//������ ����
	//�⺻������
	public Content() {
		super();
	}
	//title�� �Ű������� �޴� ������
	public Content(String title) {
		this.title = title;
	}
	//�޼ҵ� ����
	//�߻�޼ҵ�
	public abstract void totalPrice();
	//����ϱ�
	public void show()
	{
		System.out.println(title+"������ ������ "+price+"�� �Դϴ�.");
	}
	//setter�� getter ����
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
