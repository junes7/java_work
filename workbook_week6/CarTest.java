package workbook_week6;

public class CarTest {
	public static void main(String[] args) {
		//Car type의 객체 배열을 2개 만든다
		Car[] car = new Car[2];
		//배열에 사용데이터에서 제공된 2개의 Car객체를 넣는다.
		car[0] = new L3("L3","1500",50,25,0);
		car[1] = new L5("L5","2000",75,35,0);	
		//생성된 자동차의 기본 정보 출력
		Car.print();
		CarTest.print(car);
		//각각의 자동차에 25씩 주유한다.
		for (int i = 0; i < car.length; i++) {
			car[i].setOil(25);
		}
		//25씩 주유한 자동차의 정보를 출력한다.
		System.out.println("\n25 주유");
		Car.print();
		CarTest.print(car);
		//각각의 자동차에 80씩 주행한다.
		for (int i = 0; i < car.length; i++) {
			car[i].go(80);
		}
		//80씩 주행한 정보를 출력하며 엔진온도 정보를 출력한다.
		System.out.println("\n80 주행");
		Car.print();
		CarTest.print(car);
	}
	//출력 메소드 생성
	public static void print(Car[] car) {
		for (int i = 0; i < car.length; i++) {
		System.out.println(car[i].getName()+"\t\t"+car[i].getEngine()+"\t"+car[i].getOilTank()+"\t"+car[i].getOilSize()
				+"\t"+car[i].getDistance()+"\t"+((Temp)car[i]).getTempGage());
		}
	}
}
