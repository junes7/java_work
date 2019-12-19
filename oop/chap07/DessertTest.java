package oop.chap07;


public class DessertTest {
	public static void main(String[] args){
		Dessert coffee = new Dessert("아메리카노",4500,5);
		Dessert tea = new Dessert("허브티",3800,1);
		IceCream ice = new IceCream("나뚜르", 5000, 2, 310);
		
		System.out.println("*****매 출 전 표 ***** ");
		Dessert.print();//클래스 이름으로 액세스(static)
		coffee.printProductInfo();
		//객체참조변수로 액세스(non-static)
		System.out.println();
		tea.printProductInfo();
		System.out.println();
		
		IceCream.print();
		ice.printProductInfo(); //Return값이 없다.호출하고 끝나기 때문이다.
		
		int sum = coffee.getTotalPrice()//Return값이 있다. 호출하고 처리후 값을 반환하기 때문이다.
				  + tea.getTotalPrice()
				  + ice.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
