package workbook_week6;

public abstract class Mobile {
	//Ŭ���� ������� ����
	private String mobileName;
	private int batterySize;
	private String osType;
	//�⺻ ������ ����
	public Mobile() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName=mobileName;
		this.batterySize=batterySize;
		this.osType=osType;
	}
	// setter/getter ����
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize=batterySize;
	}
	// ���� ���� �޼ҵ� ����
	public abstract int operate(int time);
	public abstract int charge(int time);
	//����ϱ�
	public static void print() {
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("----------------------");
	}
	public void print1() {
		System.out.println(mobileName+"\t"+batterySize+"\t"+osType);
	}
}
