package workbook_week6;

public class CarTest {
	public static void main(String[] args) {
		//Car type�� ��ü �迭�� 2�� �����
		Car[] car = new Car[2];
		//�迭�� ��뵥���Ϳ��� ������ 2���� Car��ü�� �ִ´�.
		car[0] = new L3("L3","1500",50,25,0);
		car[1] = new L5("L5","2000",75,35,0);	
		//������ �ڵ����� �⺻ ���� ���
		Car.print();
		CarTest.print(car);
		//������ �ڵ����� 25�� �����Ѵ�.
		for (int i = 0; i < car.length; i++) {
			car[i].setOil(25);
		}
		//25�� ������ �ڵ����� ������ ����Ѵ�.
		System.out.println("\n25 ����");
		Car.print();
		CarTest.print(car);
		//������ �ڵ����� 80�� �����Ѵ�.
		for (int i = 0; i < car.length; i++) {
			car[i].go(80);
		}
		//80�� ������ ������ ����ϸ� �����µ� ������ ����Ѵ�.
		System.out.println("\n80 ����");
		Car.print();
		CarTest.print(car);
	}
	//��� �޼ҵ� ����
	public static void print(Car[] car) {
		for (int i = 0; i < car.length; i++) {
		System.out.println(car[i].getName()+"\t\t"+car[i].getEngine()+"\t"+car[i].getOilTank()+"\t"+car[i].getOilSize()
				+"\t"+car[i].getDistance()+"\t"+((Temp)car[i]).getTempGage());
		}
	}
}
