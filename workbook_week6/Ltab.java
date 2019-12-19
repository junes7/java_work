package workbook_week6;

public class Ltab extends Mobile {
	//기본 생성자 생성
	public Ltab() {
		
	}
	//3개의 클래스 변수를 입력받는 생성자 생성
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}
	//사용과 충전 메소드 생성
	public int operate(int time) {
		setBatterySize(getBatterySize()-10*time);
		return getBatterySize();
	}
	public int charge(int time) {
		setBatterySize(getBatterySize()+10*time);
		return getBatterySize();
	}
}
