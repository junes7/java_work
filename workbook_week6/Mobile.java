package workbook_week6;

public abstract class Mobile {
	//클래스 멤버변수 선언
	private String mobileName;
	private int batterySize;
	private String osType;
	//기본 생성자 생성
	public Mobile() {
		
	}
	//3개의 클래스 변수를 입력받는 생성자 생성
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName=mobileName;
		this.batterySize=batterySize;
		this.osType=osType;
	}
	// setter/getter 생성
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize=batterySize;
	}
	// 사용과 충전 메소드 생성
	public abstract int operate(int time);
	public abstract int charge(int time);
	//출력하기
	public static void print() {
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------");
	}
	public void print1() {
		System.out.println(mobileName+"\t"+batterySize+"\t"+osType);
	}
}
