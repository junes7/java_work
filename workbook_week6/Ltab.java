package workbook_week6;

public class Ltab extends Mobile {
	//�⺻ ������ ����
	public Ltab() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}
	//���� ���� �޼ҵ� ����
	public int operate(int time) {
		setBatterySize(getBatterySize()-10*time);
		return getBatterySize();
	}
	public int charge(int time) {
		setBatterySize(getBatterySize()+10*time);
		return getBatterySize();
	}
}
