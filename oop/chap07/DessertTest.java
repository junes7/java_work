package oop.chap07;


public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("�Ƹ޸�ī��",4500,5);
		Dessert tea = new Dessert("���Ƽ",3800,1);
		IceCream ice = new IceCream("���Ѹ�", 5000, 2, 310);
		
		System.out.println("*****�� �� �� ǥ ***** ");
		Dessert.print();//Ŭ���� �̸����� �׼���(static)
		coffee.printProductInfo();
		//��ü���������� �׼���(non-static)
		System.out.println();
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();
		ice.printProductInfo(); //Return���� ����.ȣ���ϰ� ������ �����̴�.
		
		int sum = coffee.getTotalPrice()//Return���� �ִ�. ȣ���ϰ� ó���� ���� ��ȯ�ϱ� �����̴�.
				  + tea.getTotalPrice()
				  + ice.getTotalPrice();
		
		System.out.println();
		System.out.println("*** �ѱݾ� " + sum + "�� ***");
		
	}
}
