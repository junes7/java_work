package workbook_week6;

public class Otab extends Mobile {
	//�⺻ ������ ����
	public Otab() {
		
	}
	//3���� Ŭ���� ������ �Է¹޴� ������ ����
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}
	//���� ���� �޼ҵ� ����
	public int operate(int time) {
		setBatterySize(getBatterySize()-12*time);
		return getBatterySize();
	}
	public int charge(int time) {
		setBatterySize(getBatterySize()+8*time);
		return getBatterySize();
	}
}
