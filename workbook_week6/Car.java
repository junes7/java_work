package workbook_week6;

public abstract class Car {
	//클래스 멤버변수 선언
	private String name;
	private String engine;
	private int oilTank; // Oil Tank 사이즈
	private int oilSize; // 현재 주유된 Oil 양
	private int distance; // 주행 거리
	// 생성자 생성
	public Car() {
		
	}
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		this.name=name;
		this.engine=engine;
		this.oilTank=oilTank;
		this.oilSize=oilSize;
		this.distance=distance;
	}
	// 필요 getter/setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getOilTank() {
		return oilTank;
	}
	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	// 필요 메소드 생성
	public void go(int distance) {
		this.distance+=distance;
	}
	public abstract void setOil(int oilSize);
	// 출력하기
	public static void print() {
		System.out.println("vehiclName engineSize oilTank oilSize distance temperature");
		System.out.println("------------------------------------------------------------");
	}
}
