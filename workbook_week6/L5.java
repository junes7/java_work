package workbook_week6;

public class L5 extends Car implements Temp {
	//생성자 생성
	public L5() {
		
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name,engine,oilTank,oilSize,distance);
	}
	//오버라이딩 - 내용 수정
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
