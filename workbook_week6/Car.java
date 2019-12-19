package workbook_week6;

public abstract class Car {
	//Ŭ���� ������� ����
	private String name;
	private String engine;
	private int oilTank; // Oil Tank ������
	private int oilSize; // ���� ������ Oil ��
	private int distance; // ���� �Ÿ�
	// ������ ����
	public Car() {
		
	}
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		this.name=name;
		this.engine=engine;
		this.oilTank=oilTank;
		this.oilSize=oilSize;
		this.distance=distance;
	}
	// �ʿ� getter/setter ����
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
	// �ʿ� �޼ҵ� ����
	public void go(int distance) {
		this.distance+=distance;
	}
	public abstract void setOil(int oilSize);
	// ����ϱ�
	public static void print() {
		System.out.println("vehiclName engineSize oilTank oilSize distance temperature");
		System.out.println("------------------------------------------------------------");
	}
}
