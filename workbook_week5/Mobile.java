package workbook_week5;

public class Mobile {
	//멤버변수 선언
	private String mobileName;
	private int batterySize;
	private String osType;
	//생성자 생성
	public Mobile() {
		
	}
	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	//setter와 getter생성
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	// 사용과 충전
	public int operate(int time) {	//사용
		batterySize-=time*10;
		return batterySize;
	}
	public int charge(int time) {   //충전
		batterySize+=time*10;
		return batterySize;
	}
	//출력하기
	public void print() {
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------");
	}
	public void print1() {
		System.out.println(mobileName+"\t"+batterySize+"\t"+osType);
	}
}