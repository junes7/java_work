package workbook_week6;

public class L5 extends Car implements Temp {
	//������ ����
	public L5() {
		
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name,engine,oilTank,oilSize,distance);
	}
	//�������̵� - ���� ����
	@Override
	public int getTempGage() {
		int temp = getDistance()/10*2;
		return temp;
	}
	@Override
	public void go(int distance) {
		super.go(distance);
		setOilSize(getOilSize()-distance/8);
	}
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
}
