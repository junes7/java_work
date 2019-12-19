package workbook_week5;

public class Otab extends Mobile {
	public Otab() {
		
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	public int operate(int time) {
		setBatterySize(getBatterySize()-time*12);
		return getBatterySize();
	}
	public int charge(int time) {
		setBatterySize(getBatterySize()+time*8);
		return getBatterySize();		
	}
}
