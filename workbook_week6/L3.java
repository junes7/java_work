package workbook_week6;

public class L3 extends Car implements Temp {
	//생성자 생성
	public L3() {
		
	}
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name,engine,oilTank,oilSize,distance);
	}
	//오버라이딩 - 내용수정
	@Override
	public void go(int distance) {
		super.go(distance);
		setOilSize(getOilSize()-distance/10);
	}

	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}

	@Override
	public int getTempGage() {
		int temp = getDistance()/10;
		return temp;
	}
}
